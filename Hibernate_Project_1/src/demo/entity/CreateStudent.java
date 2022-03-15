package demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudent {
    public static void main(String[] args) {
        
        //create session factory
        
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        
        //Create Session

        Session session = factory.getCurrentSession();
        
        try {

            System.out.println("Creating a New Student Object");

            Student tempStudent = new Student("Nitish","Kumar","Nitish14920@gmail.com");

            session.beginTransaction();

            System.out.println("Saving the student");
            session.save(tempStudent);

            session.getTransaction().commit();
            }
        finally{
            factory.close();
        }
    }
}
