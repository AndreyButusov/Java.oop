package less4.controller;

import less4.model.Teacher;
import less4.model.User;
import less4.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController{

  private TeacherService  service = new TeacherService();

  public void sendOnConsole(List<Teacher> teachers){
      service.sendOnConsole(teachers);
  }

  public void setTeacher(Teacher teacher1,Teacher teacher2){
      service.setTeacher(teacher1,teacher2);
  }

  public  Teacher createTeacher(int id, String name, String last){
      return service.createTeacher(id, name, last);
  }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }


}
