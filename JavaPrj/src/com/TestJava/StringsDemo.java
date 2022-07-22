package com.TestJava;

public class StringsDemo {
    public static void main(String args[]){
        String s = "Payment $100 is received";
        System.out.println(s.contains("$"));
        System.out.println(s.charAt(8));
        System.out.println(s.indexOf("$"));
        System.out.println(s.substring(0,9));
    }

}
