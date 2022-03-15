package demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteStudent {
    public static void main(String[] args) {

        //create session factory

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //Create Session

        Session session = factory.getCurrentSession();

        try {
            int studentID=7;
            System.out.println("Updating Student");
            session.beginTransaction();

            List<Student> students = session.createQuery("from Student").getResultList();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");

            Student student = session.get(Student.class,studentID);

            session.delete(student);

            session.getTransaction().commit();


            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete from Student where lastName = 'oberoi'").executeUpdate();

            session.getTransaction().commit();
            displayStudents(students);
            System.out.println("-------------------------------------------------------------");
            //Reading the data

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
