import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Anushka", 101);
        Faculty f = new Faculty("Dr. Sharma", "Physics");

        s.display();
        f.display();
    }
}
