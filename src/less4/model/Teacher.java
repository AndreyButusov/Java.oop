package less4.model;

public class Teacher extends User  {

    public Teacher(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Учитель %d - %s %s", id, name, lastName);
    }


}
