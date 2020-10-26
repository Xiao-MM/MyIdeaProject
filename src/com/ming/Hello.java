package com.ming;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
    public static void main(String[] args) throws ParseException {
//        System.out.println("Hello world!");
//        long currentTimeMillis = System.currentTimeMillis();
//        long expireTime = currentTimeMillis+30000;
//        System.out.println(expireTime);
//        System.out.println(new Date(159538859000l));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date = dateFormat.parse("2020-07-22 11:40");
        long time = date.getTime();
        System.out.println(time);

        int[] arr = new int[]{};
    }
}
