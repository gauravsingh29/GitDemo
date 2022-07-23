package com.TestJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String g[]){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat();
        System.out.println(sd.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(  Calendar.DAY_OF_WEEK);
        System.out.println(  Calendar.DAY_OF_MONTH);
        System.out.println("Test Git");
		 System.out.println("Test Git1");
		  System.out.println("Test Git2");
		   System.out.println("Test Git3");

    }
}
