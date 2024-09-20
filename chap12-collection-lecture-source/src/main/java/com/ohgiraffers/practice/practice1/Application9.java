package com.ohgiraffers.practice.practice1;

import java.io.*;
import java.util.Properties;

public class Application9 {

    public static void main(String[] args) {

        Properties prop = new Properties();

        prop.setProperty("drive","com.mysql.cj.jdbc.Driver");
        prop.setProperty("url","jdbc:mysql//localhost/menu");
        prop.setProperty("username","ohgiraffers");
        prop.setProperty("password","ohgiraffers");


        System.out.println("prop = " + prop);
        System.out.println("===================================");

        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Properties prop2 = new Properties();
        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);
            System.out.println("===================================");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
