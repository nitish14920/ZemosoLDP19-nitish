
package demo.entity;

        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.cfg.Configuration;


public class UpdateStudent {
    public static void main(String[] args) {

        //create session factory

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //Create Session

        Session session = factory.getCurrentSession();

        try {
            int studentID=12;
            System.out.println("Updating Student");
            session.beginTransaction();

            Student student = session.get(Student.class,studentID);

            student.setFirstName("Nitin");

            System.out.println(student);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Student set email = 'nitin@gmail.com'").executeUpdate();

            session.getTransaction().commit();
            System.out.println(student);
            //Reading the data

        }
        finally{
            factory.close();

        }
    }
}
