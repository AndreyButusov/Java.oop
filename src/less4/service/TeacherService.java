package less4.service;

import less4.model.Teacher;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.List;

public class TeacherService {
    private UserView<Teacher> view = new TeacherView();

    public void sendOnConsole(List<Teacher> teachers){
        view.sendOnConsole(teachers);

    }

    public Teacher createTeacher(int id, String name, String last) {
        return new Teacher(id, name, last);
    }

    public void setTeacher(Teacher teacher1, Teacher teacher2){
        teacher1.setName(teacher2.getName());
        teacher1.setLastName(teacher2.getLastName());
        teacher1.setId(teacher2.getId());
    }

}
