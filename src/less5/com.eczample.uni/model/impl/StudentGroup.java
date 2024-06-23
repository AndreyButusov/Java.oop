package model.impl;

import java.util.List;

import model.DB.DataBase;

public class StudentGroup {
    public Teacher teacher;
    public static List<Student> studentGroup;
    public static int id;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        StudentGroup.studentGroup = students;
        StudentGroup.id = DataBase.StudentGroupDB.size() + 1;
    }

}
