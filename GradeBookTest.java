import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//TASK 2
class GradeBookTest {
	
	GradeBook objc1;
	GradeBook objc2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		// TASK 3
		objc1 = new GradeBook(5);
		objc2 = new GradeBook(5);

		objc1.addScore(70); 
		objc1.addScore(80);
		objc1.addScore(90);
		
		objc2.addScore(20);   
		objc2.addScore(40);
		objc2.addScore(50);
	}

	@AfterEach
	void tearDown() throws Exception {
		// TASK 3
		objc1 = null;
		objc2 = null;
	}

	@Test
	void testAddScore() {
		// TASK 4
		assertTrue(objc1.toString().equals("70.0 80.0 90.0 "));
		assertTrue(objc2.toString().equals("20.0 40.0 50.0 "));
		assertEquals(3, objc1.getScoreSize());
		assertEquals(3, objc2.getScoreSize());
	}

	@Test
	void testSum() {
		// TASK 4
		assertEquals(240, objc1.sum());
		assertEquals(110, objc2.sum());
	}

	@Test
	void testMinimum() {
		// TASK 4
		assertEquals(70, objc1.minimum());
		assertEquals(20, objc2.minimum());
	}

	@Test
	void testFinalScore() {
		// TASK 4
		assertEquals(170, objc1.finalScore());
		assertEquals(90, objc2.finalScore());
	}
}
