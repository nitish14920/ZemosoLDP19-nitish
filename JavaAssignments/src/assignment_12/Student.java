package assignment_12;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yoe;
    double perDT;
    public Student(int id,String name,int age,String gender,String engDepartment,int yoe,double perDT){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment=engDepartment;
        this.yoe = yoe;
        this.perDT = perDT;
    }
//    public String getName(){
//        return name;
//    }
//    public int getId(){
//        return id;
//    }
//    public String getGender(){
//        return gender;
//    }
//    public int getAge(){
//        return age;
//    }
//    public String getEngDepartment(){
//        return engDepartment;
//    }
//    public double getPerDT(){
//        return perDT;
//    }
//    public int getYoe(){
//        return yoe;
//    }
//    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", Department=" + engDepartment +
                ", year of enrollment=" + gender +
                ", perTillDate=" + perDT +
                '}';
    }
}
