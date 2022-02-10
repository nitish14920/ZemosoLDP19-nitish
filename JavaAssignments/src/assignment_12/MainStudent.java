package assignment_12;

import assignment_7.CycleFactory.Main;

import java.util.*;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        // 1
//        students.stream()
//                .map(student -> student.engDepartment)
//                .distinct()
//                .forEach(System.out::println);

        List<Student> sorted = students.stream()
                .sorted(Comparator.comparing(student -> student.age)).collect(Collectors.toList());

        //sorted.forEach(System.out ::println);


        // 2
        List<Student> studentsEnrolled2018 = students.stream()
                .filter(student -> student.yoe >= 2018.).collect(Collectors.toList());
        //studentsEnrolled2018.forEach(student -> System.out.println(student.name));


        //3
        List<Student> maleInCS = students.stream()
                .filter(student -> student.engDepartment == "Computer Science").filter(student -> student.gender == "Male").collect(Collectors.toList());
       // maleInCS.forEach(System.out::println);


        //4
        Map<String ,List<Student>> groupByGender = students.stream()
                .collect(Collectors.groupingBy(student -> student.gender));

//        groupByGender.forEach((s, students1) -> {
//            System.out.println(s);
//            students1.forEach(System.out::println);
//            System.out.println();
//        });


        //5
        Map<String,Double> avgOfmaleFemale = students.stream()
                .collect(Collectors.groupingBy(student -> student.gender,Collectors.averagingInt(student ->student.age)));
        //System.out.println(avgOfmaleFemale);


        //6
        Optional<Student> highestPercent=
                students.stream().collect(Collectors.maxBy(Comparator.comparingDouble(student -> student.perDT)));
        //System.out.println(highestPercent);

        //7
        Map<String ,Long> studentCountByDepartment = students.stream()
                .collect(Collectors.groupingBy(student->student.engDepartment,Collectors.counting()));
        //System.out.println(studentCountByDepartment);

        Set<Map.Entry<String ,Long>> entrySet = studentCountByDepartment.entrySet();
        //System.out.println(entrySet);
//        for (Map.Entry<String ,Long> entry:entrySet) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        //8
        Map<String ,Double> avgPerByDep = students.stream()
                .collect(Collectors.groupingBy(student -> student.engDepartment,Collectors.averagingInt(student-> (int) student.perDT)));
        //System.out.println(avgPerByDep);
        Set<Map.Entry<String, Double>> entrySet2 = avgPerByDep.entrySet();
        //System.out.println(entrySet2);
        for (Map.Entry<String ,Double> entry2:entrySet2) {
            System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }

        //9
        Optional<Student> youngestMaleStudentInElectronic =
                students.stream()
                        .filter(e -> e.gender =="Male" && e.engDepartment=="Electronic")
                        .min(Comparator.comparingInt(student->student.age));
        System.out.println(youngestMaleStudentInElectronic);

        //10
        Map<String, Long> countMaleFemaleStudentsInCS=
                students.stream()
                        .filter(e -> e.engDepartment=="Computer Science")
                        .collect(Collectors.groupingBy(student -> student.gender, Collectors.counting()));

        System.out.println(countMaleFemaleStudentsInCS);
    }



    public static List<Student> getStudents(){
        return List.of(
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
                new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
                new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
                new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
                new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
                new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
                new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
                new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
                new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
                new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)
        );
    }
}
