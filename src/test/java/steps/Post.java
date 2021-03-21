package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {// deve extends para pegar o driver da classe base
   // declarar var base
    private Base base; //base que declarointernamente

    public Post(Base base) { // aqui recebe a base da classe base botão direito generator construtor // sempre tem que ter o construtor
        this.base = base; // aqui junta
    }
    // declarar o selenium na base

    @Dado("^que acesso o site Wikipedia em Portugues$")
    public void queAcessoOSiteWikipediaEmPortugues() {
        base.driver.get(url); // acessar o site

    }
   //apagar as trows
    @Quando("^pesquiso por \"([^\"]*)\"$")//ovo da pascoa fica dentro desses caracteres quando declaro uma variavel ele puxa da features a palavra que é
    public void pesquisoPor(String produto)  {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto)  {
        assertTrue(base.driver.getTitle().contains(produto)); // verifica se no titulo tem a palavra ovo da pascoa

    }
}
