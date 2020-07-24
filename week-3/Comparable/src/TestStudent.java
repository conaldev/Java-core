import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student(1, "Vinh", 25, "Hanoi"));
        listStudents.add(new Student(10, "Vinh", 26, "Hanoi"));
        listStudents.add(new Student(8, "Hung", 27, "Hanoi"));
        listStudents.add(new Student(7, "Tuyen", 25, "Hanoi"));
        Collections.sort(listStudents);
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
