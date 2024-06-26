package homework.service;

import homework.model.Saver;
import homework.model.User;

public class SaverUser implements Saver<User>{

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}