package less3;

// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Program
 */
public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup(null);

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);


        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for(Student student: studentGroup) {
        //     System.out.println(student);
        // }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямбда выражение

        // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        System.out.println(arrayList);

        StudentGroup studGroup1 = new StudentGroup("АЭЛ-111");
        StudentGroup studGroup2 = new StudentGroup("АЭЛ-112");
        StudentGroup studGroup3 = new StudentGroup("АЭЛ-113");
        StudentGroup studGroup4 = new StudentGroup("АТС-111");
        StudentGroup studGroup5 = new StudentGroup("АТС-112");

        Student petya = new Student("Петя", 5, studGroup2);

        Stream stream1 = new Stream("Электроснабжение");
        Stream stream2 = new Stream("Автоматизация, телесигнализация, связь");

        stream1.addGroups(studGroup1);
        stream1.addGroups(studGroup2);
        stream1.addGroups(studGroup3);
        stream2.addGroups(studGroup4);
        stream2.addGroups(studGroup5);

        System.out.println(stream1.name + " " + stream1);
        System.out.println(stream2.name + " " + stream2);

        Iterator<StudentGroup> iterator = new StreamIterator(stream1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Stream> streams = new ArrayList<Stream>(List.of(stream1, stream2));
        System.out.println(streams);
        Collections.sort(streams,(s1, s2) -> s1.groups.size() - s2.groups.size());
        System.out.println(streams);

    }

}