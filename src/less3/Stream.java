package less3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    public String name;

    public List<StudentGroup> groups = new ArrayList<>();

    public Stream(String name) {
        this.name = name;
    }

    public void addGroups(StudentGroup group){
        groups.add(group);
    }

    @Override
    public String toString() {
        return groups.toString();
    }
    

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public int compare(StreamComparator streamComparator, Stream o2) {
        return groups.size() - o2.groups.size();
    }

}
