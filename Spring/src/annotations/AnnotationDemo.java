package annotations;

import annotations.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach2",Coach.class);

        System.out.println(theCoach.getDailyPlan());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
