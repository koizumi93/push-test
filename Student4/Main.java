package List.Student4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("中田", "1年生");
        Student s2 = new Student("藤井", "2年生");
        Student s3 = new Student("遠藤", "3年生");
        Student s4 = new Student("後藤", "1年生");

        List<Student> Studens = new ArrayList<>();
        Studens.add(s1);
        Studens.add(s2);
        Studens.add(s3);
        Studens.add(s4);

        List<String> firstGradeStudentList = Studens.stream().filter(s -> s.getGrade().contains("1年生"))
                .map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(firstGradeStudentList);

    }
}
