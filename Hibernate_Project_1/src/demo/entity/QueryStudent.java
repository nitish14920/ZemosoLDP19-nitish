package demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudent {
    public static void main(String[] args) {

        //create session factory

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //Create Session

        Session session = factory.getCurrentSession();

        try {


            session.beginTransaction();



            List<Student> students = session.createQuery("from Student").getResultList();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");

            students = session.createQuery("from Student s where s.lastName='Kumar'").getResultList();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");

            students = session.createQuery("from Student s where s.lastName='Kumar'" +
                     " OR s.firstName = 'neha'").getResultList();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");

            students = session.createQuery("from Student s where s.email LIKE 'ku%'").getResultList();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");


            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            factory.close();
        }
    }

    private static void displayStudents(List<Student> students) {
        for (Student student : students){
            System.out.println(student);
        }
    }
}
