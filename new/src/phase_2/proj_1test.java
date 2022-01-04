package phase_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class proj_1test {
	
	static proj_1test Cal;

	@BeforeAll
	static void beforeAll() throws Exception {
		System.out.println("Initializing");
	}
	
	@AfterAll
	static void afterAll() throws Exception {
		System.out.println("The End");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before test run");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after test run");
	}

	@Test
	public void test_ADD() {
		if (Cal == null) {
			Cal = new proj_1test();
		}
		int out = Cal.add(10,20);
		System.out.println("test run");
		//System.out.println("Result " + out);
		//assertTrue(out == 30,"out should be 30");
		assertEquals(30,out,"Sum not matching");
	}
	
	@Test
	public void test_PRODUCT() {
		if (Cal == null) {
			Cal = new proj_1test();
		}
		int out2 = Cal.product(6,6);
		System.out.println("test run");
		//System.out.println("Result " + out2);
		//assertTrue(out2 == 36,"out2 should be 36");
		assertEquals(36,out2,"Product not matching");
	}

	private int product(int i, int j) {
		return i*j;
	}

	private int add(int i, int j) {
		return i+j;
	}

	
}
