package com.SpringBoot.SpringBootPart1.service;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepoInterface;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements FakeRepoInterface {



    final FakeRepo fakeRepo;

    public UserServiceImplementation(FakeRepo fakeRepo) {

        this.fakeRepo = fakeRepo;
    }

    @Override
    public String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
        return fakeRepo.insertUser(userId,userName,userSurname);
    }

    @Override
    public String findUserById(int userId) {
        return fakeRepo.findUserById(userId);
    }

    @Override
    public String deleteUser(int userId) {
        return fakeRepo.deleteUser(userId);
    }


}
