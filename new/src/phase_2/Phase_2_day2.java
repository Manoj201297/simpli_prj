package phase_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase_2_day2 {

	@BeforeAll
	static void beforeAll() {
		System.out.println("HUHU");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("HAHA");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("WORORORORO");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("MAAMAMAAMA");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("ZEEHAHAHAHAHAHA");
	}

}
