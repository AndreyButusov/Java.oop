package less3;

/**
 * Student
 */
public class Student implements Comparable<Student> {

    public String name;
    public int id;
    public StudentGroup studGroup;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, StudentGroup studGroup) {
        this.name = name;
        this.id = id;
        this.studGroup = studGroup;
    }
    
    // public void GoGroup(StudentGroup studGroup) {
    //     studGroup.addStudent();
    // }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        // if (o.name.length() > this.name.length()) return -1;
        // else if (o.name.length() < this.name.length()) return 1;
        // return 0;

        return this.name.length() - o.name.length();
    }
}