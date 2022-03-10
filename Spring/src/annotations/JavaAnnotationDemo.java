package annotations;

import annotations.classes.SportConfig;
import annotations.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaAnnotationDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("tennisCoach2",Coach.class);

        System.out.println(theCoach.getDailyPlan());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}

