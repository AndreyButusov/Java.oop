package controller;

import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudentGroupService;

public class StudentGroupController {
    
    private StudentGroupService service = new StudentGroupService();
    private TeacherController teacherService = new TeacherController();

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studGroup){
        return service.createStudentGroup(teacher, studGroup);
    }

    public StudentGroup getStudentGroup(int id, List<Integer> s){
        return service.getStudentGroup(teacherService.getById(id), s);
    }
    
}