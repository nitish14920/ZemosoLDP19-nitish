package com.company.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationcontext.xml");

    Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyPlan());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
