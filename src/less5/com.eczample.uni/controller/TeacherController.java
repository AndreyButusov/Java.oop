package controller;

import java.util.List;

import model.DB.DataBase;
import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {
    private TeacherService service = new TeacherService();

    public Teacher createTeacher(String name, String lastName, int idgroup) {
        int id = DataBase.StudentGroupDB.size() + 1;
        return service.createTeacher(id, name, lastName, idgroup);

    }    
    
    public Teacher getById(int id) {

            Teacher teacher = null;
        try {
            teacher = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

        public List<Teacher> getAllTeachers() {
        return service.getAllTeachers();
    }
    
}
