package com.ming.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Calendar calendar = new GregorianCalendar();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.format(calendar.getTime());
        timer.schedule(new MyTask(),calendar.getTime(),5000L);
    }
}
class MyTask extends TimerTask{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("放空一下大脑...");
        }
        System.out.println("本次执行结束...");
    }
}
