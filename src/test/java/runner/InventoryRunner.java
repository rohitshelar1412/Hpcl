package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="Stepdefinitions",
		plugin= {"pretty","html:target/CucumberReport.html"},
		tags="@addproduct"
                      )
public class InventoryRunner {

}
