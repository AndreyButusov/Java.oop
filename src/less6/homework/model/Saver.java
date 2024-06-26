package homework.model;

public interface Saver<T extends User> {
    
    void save(T user);
    
}
