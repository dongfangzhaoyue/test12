package com.in.temp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bsh
 * @date 2022/5/6 - 10:06
 */
//psvm
    //sout
    //soutp
    //soutm
    //soutv
    //xxx.sout
public class module {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("module.main");
        System.out.println("args = " + args);
        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println(num2);
//fori
        String[] arr=new String[]{"Tom","Mike","Jay","hello"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
//iter 增强for循环
            for (String s : arr) {
                System.out.println(s);
            }            
//itar
            for (int j = 0; j < arr.length; j++) {
                String s = arr[j];
                System.out.println(s);
//list.for
                ArrayList list = new ArrayList();
            list.add(123);
            list.add(456);
            list.add("abc");

               /* for (Object o : list) {
                    System.out.println(o);
                }
//list.fori 正序遍历
                for (int num = 0; i < list.size(); i++) {

                }
//list.forr 倒序遍历
                for (int num4 = list.size() - 1; i >= 0; i--) {

                }
//ifn
                ArrayList list2 = new ArrayList();
                list.add(123);
                list.add(456);
                list.add("abc");
                if (list == null) {

                }
//inn
                if (list != null) {

                }
//xxx.nn /xxx.null
                if (list != null) {

                }
                if (list == null) {

                }*/
            }
        }
    }
}
