/*1) создаем 3 классса-теста
2) каждый из которых будет тестировать одну функцию калькулятора
3) протестировать методы 3 наборами данных (используем Parametrize)
4) объеденить 3 класса-теста в Test Suite.
*/

package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Test1.class, Test2.class, Test3.class })
public class TestSuit {

}
