package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{

    private Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before // importar como cumcumber
    public void iniciar(){

        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        base.driver = new ChromeDriver(); // o valor url pode estar no hooks ou na base

        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        base.driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        base.driver.quit();

    }

}
