package com.SpringBoot.SpringBootPart1.service;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    FakeRepoInterface fakeRepoInterface;


    @Override
    public Supplier<String> addUser(long userId, String userName, String userSurname)  {
        System.out.println(fakeRepoInterface.insertUser(1,"Jupiter ","Mars ")+"added");
        return null;
    }

    @Override
    public String removeUser(long userId) {
        System.out.println(fakeRepoInterface.deleteUser(1)+ " removed");

        return null;
    }

    @Override
    public String getUser(long userId) {
        System.out.println("Hello "+fakeRepoInterface.findUserById(1));

        return null;
    }
}
