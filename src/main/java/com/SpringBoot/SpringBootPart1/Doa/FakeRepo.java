package com.SpringBoot.SpringBootPart1.Doa;
import com.SpringBoot.SpringBootPart1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import static com.SpringBoot.SpringBootPart1.model.User.getUserName;
import static com.SpringBoot.SpringBootPart1.model.User.getUserSurname;


@Repository
public class FakeRepo implements FakeRepoInterface {

    //creating an object with list of user
    private static final ArrayList<User> userArrayList = new ArrayList<>();

    //add  user into the list
    @Override
    public  String insertUser(long userId, String userName, String userSurname){
        User user = new User(userId,userName,userSurname);
        userArrayList.add(user);
        return userName ;
    }

    //search for user from the list
    @Override
    public  String findUserById(long userId){
        for (User ignored: userArrayList){
            return   getUserName("Sindi") + getUserSurname(" K");
        }
        return  getUserName("Sindi") ;
    }

    //remove user from list
    @Override
    public  String deleteUser(long userId) {
        User user = new User(userId,"","");
        userArrayList.remove(user);
        return getUserName("Sindi") ;
    }


}