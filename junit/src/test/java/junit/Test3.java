package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test3 {
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

	public Test3(int val1, int val2, int result) {

		this.val1 = val1;
		this.val2 = val2;
		this.result = result;

	}

	@Parameterized.Parameters(name = "{index}:multiple of: ({0}/{1}) = {2}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1, 0 }, { 1, 5, 5 }, { 99, 100, 9900 } });
	}

	@Test
	public void testDividing() {
		assertEquals(result, calc.getMultiple(val1, val2));
	}
}
