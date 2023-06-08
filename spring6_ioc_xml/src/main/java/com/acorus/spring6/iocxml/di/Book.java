package com.acorus.spring6.iocxml.di;

/**
 * ClassName: Book
 * Package: com.acorus.spring6.iocxml.di
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 10:50
 * @Version 1.0
 */
public class Book {

    private String bname;   //name
    private String author;  //author

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
