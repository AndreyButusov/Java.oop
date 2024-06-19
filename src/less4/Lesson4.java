package less4;

import less4.controller.TeacherController;
import less4.model.Teacher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        TeacherController teachers = new TeacherController();

        Teacher teacher1 = new Teacher(1, "Надежда", "Серова");
        Teacher teacher2 = new Teacher(2, "Валентина", "Малиновская");
        Teacher teacher3 = new Teacher(3, "Евгений", "Фролов");
        Teacher teacher4 = teachers.createTeacher(4, "Олег", "Самаров");

        teachers.sendOnConsole(List.of(teacher1, teacher2, teacher3, teacher4));

        teachers.setTeacher(teacher3, new Teacher(3, "Екатерина", "Рыжова"));

        teachers.sendOnConsole(List.of(teacher1, teacher2, teacher3, teacher4)); 

    }
}
