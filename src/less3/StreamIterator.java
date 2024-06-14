package less3;


import java.util.Iterator;

public class StreamIterator implements Iterator<StudentGroup>{
    
    private Stream stream;
    private int index = 0;

    public StreamIterator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public boolean hasNext() {
        return index < stream.groups.size();
    }

    @Override
    public StudentGroup next() {
        return stream.groups.get(index++);
    }
}
