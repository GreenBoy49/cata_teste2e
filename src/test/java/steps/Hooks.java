package steps;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends DriverFactory {
	public Hooks() throws Exception {
		super();
	}

	@Before
	public void beforeScenario() {
		initialize();
	}
	
	@After
	public void afterScenario(Scenario scenario)  {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Screenshot on failure");
		}
		destroyDriver();
	}
	
}
