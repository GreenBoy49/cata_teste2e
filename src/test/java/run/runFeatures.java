package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/" ,
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json"},
        strict = true
       // , tags = "@verifyCategory"

)
public class runFeatures {
}
