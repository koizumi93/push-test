package List.Student4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) {
        StudentList s1 = new StudentList("中田", "1年生");
        StudentList s2 = new StudentList("藤井", "2年生");
        StudentList s3 = new StudentList("遠藤", "3年生");
        StudentList s4 = new StudentList("後藤", "1年生");

        List<StudentList> Studens = new ArrayList<>();
        Studens.add(s1);
        Studens.add(s2);
        Studens.add(s3);
        Studens.add(s4);

        List<String> firstGradeStudentList = Studens.stream().filter(s -> s.getGrade().contains("1年生"))
                .map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(firstGradeStudentList);

    }
}
