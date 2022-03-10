package demo;

import demo.Classes.Hockey;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");

        Hockey theCoach = context.getBean("hockeyCoach",Hockey.class);
        System.out.println(theCoach.getDailyPlan());
        System.out.println(theCoach.getDailyFortune());

        // for calling literal values

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
