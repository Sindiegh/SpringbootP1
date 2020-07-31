package com.SpringBoot.SpringBootPart1.service;

import java.util.function.Supplier;

public interface UserService {

    Supplier<String> addUser(long userId, String userName, String userSurname) ;
    String removeUser(long userId);
    String getUser(long userId);

   }