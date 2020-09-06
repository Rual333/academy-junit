package junit;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	public boolean onlyTrue = true;

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		if (onlyTrue) {
			onlyTrue = true;
			return;
		}
		System.out.println("Execution successfully finished : " + description.getMethodName());
	}

	@Override
	public void testFailure(Failure failure) throws Exception {
		onlyTrue = false;
	}

}
