package org.example.string;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

public class StringDemo {
    private static String des = "I am Java Developer and Spring Framework Developer";
    private static String city = ", I am from shiraz city.";
    private static char aChar = 'a';
    private static char[] charArr = {'a', 'i', 'r'};
    private static Date date;
    private static final String pattern = "yyyy-MM-dd 'T' HH:mm:ss.SSS 'Z'";
    private static final SimpleDateFormat format = new SimpleDateFormat(pattern);
private static String str1 = "             I      java     dev     in  google   i n    us  a... ...    ";
private static String s1 = "     Milad";
private static String s2 = "    mila    d        ";


    public static void main(String[] args) {
        //  charAtDemo();
        //   concatExample();
        //    formatterExampleInJava();
        //formatExampleInJava();
        //trimExample();
        //subStringExampleInJava();
        //matchesExampleJava();
        //compareToIgnoreExampleJava();
        //stripExampleInJava();
        //otherMethodInStringInJava();


    }

    private static void otherMethodInStringInJava() {
        System.out.println(city.isBlank());
        System.out.println(city.isEmpty());
        System.out.println(city.repeat(2));
        System.out.println(city.getBytes().length);
        System.out.println(city.contains("m"));
    }

    private static void stripExampleInJava() {
        System.out.println(str1.strip());
        System.out.println(s1.strip());
        System.out.println(str1.stripLeading());
        System.out.println(s2.stripLeading());
    }

    private static void compareToIgnoreExampleJava() {
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(city.compareToIgnoreCase(city));
        System.out.println(city.compareToIgnoreCase(des));
    }

    private static void matchesExampleJava() {
        System.out.println(city.matches("miladrostami"));
        System.out.println(city.matches("city"));
        System.out.println(city.matches(", I am from shiraz city."));
    }

    private static void subStringExampleInJava() {
        System.out.println(city.substring(1));
        System.out.println(city.substring(3,8));
        System.out.println(city.subSequence(2,7));
    }

    private static void trimExample() {
        System.out.println(str1.trim());
    }

    private static void formatExampleInJava() {
        String str1 = String.format("description is :: %s", des);
        String str2 = String.format("description is ::  %S", des);
        String str3 = String.format("description is :: %c", aChar);
        String str4 = String.format("description is :: %C", aChar);
        String str5 = String.format("description is :: %a", 12548.34443434343);
        String str6 = String.format("description is :: %b", des);
        String str7 = String.format("description is :: %d", 4587);
        String str8 = String.format("description is :: %.21e", 23.22332);
        String str9 = String.format("value is : %f", 1548.4587);
        String str10 = String.format("value is %.24f", 3332.33434);
        String str11 = String.format("value is %g", 333234434.34443434);
        String str12 = String.format("value is %.234f", 333234434.34);
        String str13 = String.format("value is %h", des);
        String str14 = String.format("value is %s %n", city);
        //      String str15 = String.format("value is %t",date);
        String str16 = String.format("value is %.234f", 333234434.34443434);
        String str17 = String.format("value is %.234f", 333234434.34443434);
        String str18 = String.format("value is %.234f", 333234434.34443434);
        String date = format.format(new Date());
        System.out.println(date);
    }

    private static void formatterExampleInJava() {
        Formatter formatter = new Formatter();
        formatter.format("%d", 123);
        //  System.out.println(formatter.toString());
        formatter.format("%x", 123);
        System.out.println(formatter.toString());
        formatter.format("%c", 'X');
        System.out.println(formatter.toString());
        formatter.format("%f", 0.1);
        System.out.println(formatter.toString());
        formatter.format("%s%n", "Hello, World");
        System.out.println(formatter.toString());
        formatter.format("%10.2f", 98.375);
        System.out.println(formatter.toString());
        formatter.format("%05d", 123);
        System.out.println(formatter.toString());
        formatter.format("%1$d %1$d", 123);
        System.out.println(formatter.toString());
        formatter.format("%d %d", 123);
        System.out.println(formatter.toString());
        formatter.close();
    }

    private static void concatExample() {
        System.out.println(des.concat(city));
    }

    private static void charAtDemo() {
        int length = des.length();
        char[] tempToArray = new char[length];
        char[] chars = new char[length];

//converting string to char
        for (int index = 0; index < length; index++) {
            tempToArray[index] = des.charAt(index);
        }

        System.out.println(Arrays.toString(tempToArray));
        String text = new String(tempToArray);
        System.out.println(text);

        //reverse  array to string
        for (int j = 0; j < length; j++) {
            chars[j] = tempToArray[length - 1 - j];
        }
        String charStr = new String(chars);
        System.out.println(charStr);
    }


}
