package demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudent {
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

            Student tempStudent = new Student("Kunal","Kumar","kunal14920@gmail.com");

            session.beginTransaction();

            System.out.println("Saving the student");
            session.save(tempStudent);

            session.getTransaction().commit();

            //Reading the data

            System.out.println("Saved Student Generated Id: " + tempStudent.getId());
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student student = session.get(Student.class,tempStudent.getId());
            System.out.println(student);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            factory.close();
        }
    }
}
