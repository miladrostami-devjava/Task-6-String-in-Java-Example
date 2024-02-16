package org.example.string;

import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        String name = "mi";
        String name2 = "lad";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(name2);
//        System.out.println(stringBuffer);
//        stringBuffer.append(3);
//        System.out.println(stringBuffer);
//        String[] str = {"mlo","jl"};
//        stringBuffer.append(Arrays.toString(str));
//        System.out.println(stringBuffer);
//        stringBuffer.appendCodePoint(45);
//        System.out.println(stringBuffer);
      //  System.out.println(stringBuffer.capacity());
   //  stringBuffer.insert(0,434);
    //    System.out.println(  stringBuffer.lastIndexOf("str"));
     //   stringBuffer.reverse();
        stringBuffer.replace(1,4,"ros");
        System.out.println(stringBuffer);


    }


}
