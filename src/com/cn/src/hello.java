package com.cn.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author bsh
 * @date 2022/5/6 - 7:42
 */
public class hello {
    public static void main(String[] args){
        //region Description
        extracted();
        Date date = new Date();
        ArrayList list = new ArrayList();
        //endregion
     //   method1();
    list.add(0,123);
    System.out.println(list);
    System.out.println(list);

    }

    private static void extracted() {
        System.out.println("hello world");
    }

    public void eat(){
        System.out.println("客户吃饭");
    }
    public static void method1(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
