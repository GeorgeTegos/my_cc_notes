package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PirateserviceApplicationTests {

	@Autowired //Dependency Injection
	PirateRepository pirateRepository;

	 Pirate jack ;

	@BeforeAll
	public void setup(){
		jack = new Pirate("Jack","Sparrow",32);
	}


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		pirateRepository.save(jack);
	}

	@Test
	public void deletePirate(){
		pirateRepository.deleteById(1L);

	}

}
