/*5) добавить CalculatorTestListener, переопределить, метод который вызывается
 на успешное завершение теста и выводит на экран название нашего метода.*/

package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class Test4 {
	Calculator calc;

	@Before
	public void init() {
		calc = new Calculator();
	}

	@After
	public void tearDown() {
		calc = null;
	}

	@Test
	public void testSum() {
		assertEquals(2, calc.getSum(4, 1));

	}

	@Test
	public void testDiv() {
		assertEquals(4, calc.getDivide(4, 1));
	}

}
