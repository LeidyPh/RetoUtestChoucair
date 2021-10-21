package co.com.utest.entrevista.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/iniciodesesion.feature",
        tags = "@stories",
        glue ="co.com.utest.entrevista.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnersTags {

}
