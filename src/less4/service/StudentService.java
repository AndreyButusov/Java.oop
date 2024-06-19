package less4.service;

import less4.model.Student;
import less4.view.StudentView;
import less4.view.UserView;

import java.util.List;

public class StudentService {


    private UserView<Student> view = new StudentView();

    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);

    }
}
