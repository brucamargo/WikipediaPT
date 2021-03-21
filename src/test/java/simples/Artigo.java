package simples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    // teste web, atributos mais comuns
    // String url;
    String url; // endere�o do site que vamos testar

    // tem o selenium
    // Webdriver driver;

    WebDriver driver; // selenium p� chamado por driver
    // caso n�o importe autom�ticamente passar o mouse em cima e clicar em importar classe

    @Before //o simples importa como Junit
    public void iniciar() {
        // executa antes do teste

        url ="https://pt.wikipedia.org"; // site que vamos testar
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe"); //Onde est� o driver
        //chrome.driver � o tradutor que conversa com o brownser
        driver = new ChromeDriver(); // instanciar o selenium

        // configurar a tela

        driver.manage().window().maximize(); //maximizar a janela do navegador
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        // DEFINE uma espera implicita de 1 minuto, verificando e carregando a cada 1 milessimoo de segundo

    }


    @Test // executa o teste
    public void consultararquivo() {

        // abrir um site

        driver.get(url);

        // pesquisar um elemento sempre procuramos pelo id

        driver.findElement(By.id("searchInput")).sendKeys("Ovo de P�scoa"); // procura a barra de pesquisa e escrever ovo da pascoa
        driver.findElement(By.id("searchButton")).click();//clica no bot�o de pesquisar

        //v�lidar titulo da p�gina de retorno assertEquals importar static junit
        //assertEquals("Ovo de P�scoa ? Wikip�dia, a enciclop�dia livre", driver.getTitle()); //driver.get vai pegar o titulo que est� na guia

        //UTF- 8 DEVE SER MUDADA PARA ISO-88591 APERTAR CONVERT

        assertTrue(driver.getTitle().contains("Ovo de P�scoa")); // verificando se no titulo da pagina contem ovo da pascoa
    }

    @After // o simples importa como Junit
    public void finalizar() {
        // executa depois do teste
    driver.quit(); // finaliza o teste

    }


}
