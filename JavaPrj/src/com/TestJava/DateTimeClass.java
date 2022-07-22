package com.TestJava;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeClass {
    public static void main(String g[]){
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
       System.out.println(sd.format(d));
    }



}
