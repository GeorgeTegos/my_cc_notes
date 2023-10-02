package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PirateserviceApplicationTests {

	@Autowired //Dependency Injection
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;




	 Pirate jack ;
	 Ship ship;
	 Raid raid1;

	@BeforeAll
	public void setup(){
		ship = new Ship("Boaty McBoat");
		jack = new Pirate("Jack","Sparrow",32, ship);
		raid1 = new Raid("Tortuga", 100);
	}


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		pirateRepository.save(jack);
	}

//	@Test
	public void deletePirate(){
		pirateRepository.deleteById(2L);
	}

	@Test
	public void createShipAndAddPirate() {

		Pirate pirate = new Pirate("Jack", "SparrowJunior", 16, ship);

		ArrayList<Pirate> pirates;

		pirates = new ArrayList<>();

		pirates.add(jack);
		pirates.add(pirate);

		ship.setPirates(pirates);

		shipRepository.save(ship);
		pirateRepository.save(pirate);
	}

//	@Test
//	public void addPiratesAndRaids(){
//		Ship ship1 = new Ship("The Flying Dutchman");
//		shipRepository.save(ship1);
//
//		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship1);
//		pirateRepository.save(pirate1);
//
//		raidRepository.save(raid1);
////
//		raid1.addPirate(pirate1);
//
//		raidRepository.save(raid1);
//	}

	@Test
	public void addPiratesAndRaids(){
//		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

//		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);

//		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);

		raid1.addPirate(jack);
		raidRepository.save(raid1);

	}

}
