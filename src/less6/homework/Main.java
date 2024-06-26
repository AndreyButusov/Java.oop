package homework;

import homework.model.Reporter;
import homework.model.Saver;
import homework.model.User;
import homework.service.ReportUser;
import homework.service.SaverUser;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter<User> reporter = new ReportUser();
        Saver<User> saver = new SaverUser();
        
        reporter.report(user);
        saver.save(user);
    }
}