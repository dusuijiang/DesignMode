package com.designmode;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args) {

        String str="abc";
        System.out.println(str.hashCode());
        str=str+"de";
        System.out.println(str.hashCode());
        System.out.println(" ImplA : ");

         StringBuilder stringBuilder=new StringBuilder().append("abc").append("de");
         System.out.println(str);
        System.out.println(stringBuilder.hashCode());
         stringBuilder = stringBuilder.append("sssssss");
        System.out.println(stringBuilder.hashCode());

    }

}
