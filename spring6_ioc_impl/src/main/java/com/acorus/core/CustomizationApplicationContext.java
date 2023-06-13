package com.acorus.core;


import com.acorus.annotation.CreateBean;
import org.springframework.beans.factory.BeanFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: CustomizationApplicationContext
 * Package: com.acorus.core
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 14:11
 * @Version 1.0
 */
public class CustomizationApplicationContext implements ApplicationContext {

    //存储bean的容器Map<key：类/接口 value：对象>
    private Map<Class,Object> beanFactory = new HashMap<>();
    private static String rootPath;

    public Map<Class, Object> getBeanFactory() {
        return beanFactory;
    }

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    public static void main(String[] args) {
//        CustomizationApplicationContext("com.acorus");
    }


    /**
     *通过扫描包路径自动装在bean
     * @param basePackage
     */
    public  CustomizationApplicationContext(String basePackage) {
        //将路径中的.替换位\
        String packageDirName = basePackage.replaceAll("\\.", "\\\\");
        //通过类加载器根据相对路径获取绝对路径
        try {
            Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            //循环将路径下的文件递归处理
            while (dirs.hasMoreElements()){
                URL url = dirs.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                //将根路径存在共享变量中方便之后使用
                rootPath = filePath.substring(0,filePath.length()-packageDirName.length());
                //调用方法根据绝对路径装载bean
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据绝对路径装载bean
     * @param fileParent
     */
    private void loadBean(File fileParent) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1,判断是否是文件夹
        if(fileParent.isDirectory()){
            //2,如果是获取全部文件
            File[] files = fileParent.listFiles();
            //3,如果是判断是否为空文件夹 如果是直接返回
            if(files==null||files.length==0){
                return;
            }
            for (File file : files) {
                //4,循环判断是否为文件 是处理 不是递归
                if(file.isDirectory()){
                    loadBean(file);
                }else {
                    //5,通过文件路径转变成全类名，去掉根路径
                    String pathWithClass = file.getAbsolutePath().substring(rootPath.length() - 1);
                    //6,判断包含.class并且处理把\替换成.
                    if(pathWithClass.contains(".class")){
                        String classPath = pathWithClass.replaceAll("\\\\", "\\.").replaceAll(".class", "");
                        //7,判断是否为interface 否 实例化放在map中 key判断是否为接口
                        Class<?> aClass = Class.forName(classPath);
                        //判断是否不是接口
                        if(!aClass.isInterface()){
                            //判断类上是否有@CreateBean注解
                            CreateBean createBean = aClass.getAnnotation(CreateBean.class);
                            if(createBean!=null){
                                Object instance = aClass.getDeclaredConstructor().newInstance();
                                //判断是否有接口 有的话以接口名作为key 否则以类名作为key
                                if(aClass.getInterfaces().length>0){
                                    beanFactory.put(aClass.getInterfaces()[0],instance);
                                }else{
                                    beanFactory.put(aClass,instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void loadDi(){
        //1,循环所有加载的bean

        //2,循环加载bean的对象

        //3,判断对象上是否有注解@Di

        //4,如果有注解注入属性

    }
}
