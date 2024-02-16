package org.example.string;

import java.lang.invoke.StringConcatFactory;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(465);
        sb.append("StringBuilder in Java represents a mutable sequence of" +
                " characters. Since the String Class in Java creates an " +
                "immutable sequence of characters, the StringBuilder class" +
                " provides an alternative to String " +
                "Class, as it creates a mutable sequence of characters.");

        System.out.println(sb.subSequence(22, 66));
        System.out.println(sb.replace(3,6,"rrrrrrrrrrrrrr"));



    }
}
