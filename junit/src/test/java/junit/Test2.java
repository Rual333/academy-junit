
package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test2 {

	Calculator calc;

	@Before
	public void init() {
		calc = new Calculator();
	}

	@After
	public void tearDown() {
		calc = null;
	}

	private int val1;
	private int val2;
	private int result;

	public Test2(int val1, int val2, int result) {

		this.val1 = val1;
		this.val2 = val2;
		this.result = result;

	}

	@Parameterized.Parameters(name = "{index}:divide of: ({0}/{1}) = {2}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1, 0 }, { 1, 5, 0 }, { 3, 2, 1 } });
	}

	@Test
	public void testDividing() {
		assertEquals(result, calc.getDivide(val1, val2));
	}
}
