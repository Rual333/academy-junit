/*1) создаем 3 классса-теста
2) каждый из которых будет тестировать одну функцию калькулятора
3) протестировать методы 3 наборами данных (используем Parametrize)
4) объеденить 3 класса-теста в Test Suite.
5) добавить CalculatorTestListener, переопределить, метод который вызывается на успешное завершение теста и выводит на экран название нашего метода.
*/

package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test1 {

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

	public Test1(int val1, int val2, int result) {

		this.val1 = val1;
		this.val2 = val2;
		this.result = result;

	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { -0, -0, 0 }, { 9999999, 9999999, 19999998 } });
	}

	@Test
	public void testSum() {
		assertEquals(result, calc.getSum(val1, val2));

	}
}
