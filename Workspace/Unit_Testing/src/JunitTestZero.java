import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestZero {

	@Test
	public void testComputeZero() {
		float a = 0f;
		// check difference between Java Math sqrt() and the class' Newton method         
		assertTrue("Zero Number", Newton.Compute(a) == 0);
	}

}
