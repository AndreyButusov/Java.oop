package less4.controller;

import less4.model.Student;
import less4.model.User;
import less4.service.StudentService;
import java.util.List;

public class StudentController implements UserController {

    private StudentService service = new StudentService();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        service.sendOnConsole(students);
    }

}
