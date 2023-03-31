package co.com.cloudblue.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/service.feature",
        glue = "co/com/cloudblue/stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ServiceRuner {
}
