package junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;

public class TestRunner extends BlockJUnit4ClassRunner {

	private CalculatorTestListener listener;

	public TestRunner(Class<CalculatorTestListener> listenerClass) throws org.junit.runners.model.InitializationError {

		super(listenerClass);
		listener = new CalculatorTestListener();

	}

	@Override
	public void run(final RunNotifier notifier) {

		notifier.addListener(listener);
		super.run(notifier);

	}

}