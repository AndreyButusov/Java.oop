package model;

import java.util.List;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudGroup {
    public Teacher teacher;
    public List<Student> studGroup;
    public static int id;

    public StudGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.studGroup = students;
        StudGroup.id = DataBase.StudentGroupDB.size() + 1;
    }
    
}
