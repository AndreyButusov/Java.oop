package homework.service;

import homework.model.Reporter;
import homework.model.User;

public class ReportUser implements Reporter<User> {

    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
    
}
