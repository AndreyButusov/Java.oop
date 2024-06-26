package homework.model;

public interface Reporter<T extends User> {
    
    void report(User user);
    
}
