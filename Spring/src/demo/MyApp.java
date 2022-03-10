package demo;

import demo.Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("resources/applicationcontext.xml");

    Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyPlan());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
