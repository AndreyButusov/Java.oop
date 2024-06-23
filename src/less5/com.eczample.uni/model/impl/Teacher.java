package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class Teacher extends User{

    public final static List<Integer> groups = new ArrayList<>();

    int groupId;
    
    public Teacher(int id, String name, String lastName, int idgroup) {
        super(id, name, lastName);
        this.groupId = idgroup;
    }

    public void addGroupId(int groupID) {
        groups.add(groupID);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "groups=" + groups +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'+ "\n";
    }
    
}
