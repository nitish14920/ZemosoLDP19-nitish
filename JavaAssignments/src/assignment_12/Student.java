package assignment_12;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perDT;
    public Student(int id,String name,int age,String gender,String engDepartment,int yoe,double perDT){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment = yoe;
        this.perDT = perDT;
    }

   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", Department=" + engDepartment +
                ", year of enrollment=" + yearOfEnrollment +
                ", perTillDate=" + perDT +
                '}';
    }
}
