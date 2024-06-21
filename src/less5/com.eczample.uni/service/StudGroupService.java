package service;

import java.util.ArrayList;
import java.util.List;

import controller.StudentController;
import model.StudGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudGroupService {
    
    public StudGroup createStudGroup(Teacher teacher, List<Student> StudGroup){
        return new StudGroup(teacher, StudGroup);
    }

    public void addStudents(List<Student> studGroup){
        StudGroup.studGroup.addAll(studGroup);
    }

    public void addTeacher(Teacher teacher){
        StudGroup.teacher.add(teacher);
    }

    public StudGroup getStudGroup(Teacher teacher, List<Integer> idgroup){
        StudentController studentControlle = new StudentController();
        List<Student> studGroup= new ArrayList<>();
        for (int i : idgroup) {
            Student student = studentControlle.getById(i);
            studGroup.add(student);
        }
        System.out.println("Учитель " + teacher);
        System.out.println("Студенты: " + studGroup);
        return createStudGroup(teacher, studGroup);
    }

}
