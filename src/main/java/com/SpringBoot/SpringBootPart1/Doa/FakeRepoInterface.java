package com.SpringBoot.SpringBootPart1.Doa;

public interface FakeRepoInterface {

    String insertUser(long userId, String userName, String userSurname) ;
    String findUserById(long userId);
    String deleteUser(long userId);

}