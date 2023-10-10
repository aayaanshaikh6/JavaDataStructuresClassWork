import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestNegative {

	@Test
	public void testComputeNegative() {
		float a = -10.0f;
       /*use the fact that All numeric operations with NaN as an operand produce NaN as a result. 
		Reason behind this is that NaN is unordered, so a numeric comparison operation involving 
		one or two NaNs returns false. 
		*/
		assertTrue("Negative Number", (!(Newton.Compute(a) > 0 || Newton.Compute(a) < 0 )));
	}

}
