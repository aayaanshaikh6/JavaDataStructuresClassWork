import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	// test method with a positive number and assert sqrt(10) = 3.1623
	public void testComputePositive() {
		float a = 0f;
		// check difference between Java Math sqrt() and the class' Newton method         
		assertTrue("Positive Number",Math.abs(Math.sqrt(a) - Newton.Compute(a)) < 1E-5);
	}
}
