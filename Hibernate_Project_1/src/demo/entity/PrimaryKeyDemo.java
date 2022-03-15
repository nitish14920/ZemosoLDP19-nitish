package demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
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

            Student tempStudent1 = new Student("Rahul","Kumar","rahul14920@gmail.com");
            Student tempStudent2 = new Student("neha","chhikara","chiku14920@gmail.com");
            Student tempStudent3 = new Student("preeti","chi","Nitish14920@gmail.com");
            Student tempStudent4 = new Student("Payal","oberoi","payal14920@gmail.com");

            session.beginTransaction();

            System.out.println("Saving the student");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);
            session.save(tempStudent4);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            factory.close();
        }
    }
}
