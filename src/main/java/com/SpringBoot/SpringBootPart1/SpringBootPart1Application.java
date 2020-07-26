package com.SpringBoot.SpringBootPart1;

import java.util.Collections;
import java.util.Scanner;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Application {
	public static void main(String[] args) throws NoSuchMethodException {

		Scanner input = new Scanner(System.in);

		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		application.run(args);
		System.out.println("\n"+"This is FakeRepo"+"\n");
		FakeRepo fakeRepo = new FakeRepo();
		System.out.println(fakeRepo.insertUser(1,"Sindi","K"));
		System.out.println(fakeRepo.findUserById(1));
		System.out.println(fakeRepo.deleteUser(1));
		System.out.println("\n"+"This is User Service Implementation"+"\n");
		UserServiceImplementation usrSerImp = new UserServiceImplementation(fakeRepo);
		System.out.println(usrSerImp.insertUser(1,"Sindi","K"));
		System.out.println(usrSerImp.deleteUser(1));
		System.out.println(usrSerImp.findUserById(1));



	}
}
