package com.acorus.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: TestReflect
 * Package: com.acorus.reflect
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/12 14:46
 * @Version 1.0
 */
public class TestReflect {

    /**
     * 1，获取Class对象的多种方式
     *
     */
    @Test
    public void testClazz() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1,类名.class 方式获取
        Class<Car> clazz = Car.class;
        //2,对象.getClass 方式获取
        System.out.println(new Car().getClass());
        //3,Class.forName("全路径")
        Class.forName("com.acorus.reflect.Car");
        //实例化
        Car car = clazz.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    /**
     * 2，获取构造方法
     *
     */
    @Test
    public void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> clazz = Car.class;
        //获取所有构造
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName()+"---"+constructor.getParameterCount());
        }
        //指定有参构造创建对象
        //1，public构造
//        Constructor<Car> constructor = clazz.getConstructor(String.class, Integer.class, String.class);
//        Car car1 = constructor.newInstance("wuling", 20, "blue");
//        System.out.println(car1);
        //2，private构造
        Constructor<Car> constructor = clazz.getDeclaredConstructor(String.class, Integer.class, String.class);
        constructor.setAccessible(true);
        Car car2 = constructor.newInstance("sanl", 15, "y");
        System.out.println(car2);

    }
    /**
     * 3，获取属性
     *
     */
    @Test
    public void testField() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> clazz = Car.class;
        Car car = clazz.getDeclaredConstructor().newInstance();
        //获取public属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if ("name".equals(field.getName())) {
                field.set(car,"aaa");
            }
            System.out.println(field);
        }
        System.out.println(car);
        //获取所有属性，包含私有
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if ("name".equals(field.getName())){
                field.setAccessible(true);
                field.set(car,"bc");
            }
            System.out.println(field.getName());
        }
        System.out.println(car);
    }
    /**
     * 4，获取方法
     *
     */
    @Test
    public void testMethod() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> clazz = Car.class;
        Car car = clazz.getDeclaredConstructor(String.class,Integer.class,String.class)
         .newInstance("lk", 20, "y");
        //1,public  方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if("toString".equals(method.getName())){
                String invoke = method.invoke(car).toString();
                System.out.println(invoke);
            }
            System.out.println(method.getName());
        }
        //2，private 方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if("run".equals(method.getName())){
                method.setAccessible(true);
                method.invoke(car);
            }
            System.out.println(method.getName());
        }
    }

}
