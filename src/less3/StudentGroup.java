package less3;

import java.util.Iterator;

import less4.model.Student;

public class StudentGroup implements Iterable<Student> {

    private String name;

    public StringBuilder students = new StringBuilder();

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(less3.Student van) {
        students.append(van).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
