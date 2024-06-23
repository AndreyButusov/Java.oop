package service;

import java.util.ArrayList;
import java.util.List;

import controller.StudentController;
import model.impl.StudentGroup;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> StudGroup) {
        return new StudentGroup(teacher, StudGroup);
    }

    public void addStudents(List<Student> studentGroup) {
        StudentGroup.studentGroup.addAll(studentGroup);
    }

    // public void addTeacher(Teacher teacher) {
    //     StudentGroup.teacher.addAll(teacher);
    // }

    public List<StudentGroup> getStudentGroup() {
        return DataBase.StudentGroupDB;
    }

}
