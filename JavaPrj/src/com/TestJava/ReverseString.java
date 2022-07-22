package com.TestJava;

public class ReverseString {
    public static void main(String a[]){
        String s = "madam";
        String dummy="";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
            dummy = dummy+s.charAt(i);
        }
        if(dummy.equals(s))
            System.out.println("Palindrom");
    }

}
