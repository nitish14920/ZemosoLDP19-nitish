package demo;

import demo.Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {

        // Load the spring Config File

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container

        Coach theCoach = context.getBean("myCoach" , Coach.class);
        Coach alphaCoach = context.getBean("myCoach" , Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        context.close();
    }
}
