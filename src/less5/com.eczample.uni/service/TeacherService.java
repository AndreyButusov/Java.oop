package service;

import java.util.List;

import model.DB.DataBase;
import model.impl.Teacher;

public class TeacherService {

    public Teacher createTeacher(int id, String name, String lastName, int idgroup){
        Teacher teacher = new Teacher(id, name, lastName, idgroup);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public void addGroupId(int id){//обязательно убрать в сервис (ошибка проектирования)
        Teacher.groups.add(id);
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB//список учителей
                .stream()//запускаем поток для вычислений
                // пример лямда-выражения (s -> s.getId() == id)
                .filter(s -> s.getId() == id)//вызываем метод filter фильтруя по условию (s = teacher(переменная))
                .findFirst()//вернуть первого найденого учителя
                .orElse(null);// если не нашли вернуть null (orElse закрывет поток stream)
        if (teacher == null) {
            throw new Exception("Учитель не найден");//выбрасываем проверяемое исключение, которое компилятор требует отработать
        }
        return teacher;
    }

    public List<Teacher> getAllTeachers(){
        return DataBase.teachersDB;
    }
    
}
