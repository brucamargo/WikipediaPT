package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        dryRun = false,
        monochrome = false,
        features = " src/test/resources/features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/relatorioSimples",
                "json:target/relatorioSimples.json", //precisa desserel para gerar o debaixo
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)
public class Runner {
    // runner chama a features e controla os relatorios
}
