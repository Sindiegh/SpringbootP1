package com.SpringBoot.SpringBootPart1;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest
class SpringBootPart1ApplicationTests {


	@Test
	void contextLoads() {
	}

	FakeRepo fakeRepo = new FakeRepo();
	UserServiceImplementation userService = new UserServiceImplementation( fakeRepo);

	@Test
	public void insertUserTest() throws NoSuchMethodException {
		userService.insertUser(1,"Sindiswa", "Khama");
	}
	@Test
	public void deleteUserTest(){
		userService.deleteUser(1);



	}
	@Test
	public void getUserTest() {
		userService.findUserById(2);


	}


}
