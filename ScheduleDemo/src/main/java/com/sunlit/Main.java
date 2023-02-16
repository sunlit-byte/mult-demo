package com.sunlit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.util.Date;

//开启定时任务
@EnableScheduling
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Scheduled(fixedRate =  5 * 1000)
    public void playSth(){
        System.out.println("good good study " + DateFormat.getDateTimeInstance().format(new Date()));
    }
    @Scheduled(fixedRate = 5 * 1000)
    public void playSth2(){
        System.out.println("day day up " + DateFormat.getDateTimeInstance().format(new Date()));
    }


}
