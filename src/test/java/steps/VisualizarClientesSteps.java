package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class VisualizarClientesSteps {

    private static WebDriver driver;

    @Dado("que estou na página inicial")
    public void que_estou_na_página_inicial() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/clients");
    }
    @Quando("não estou logado")
    public void não_estou_logado() {

    }
    @Então("visualizo o cliente {string} com o e-mail {string} na posição {string}")
    public void visualizo_o_cliente_com_o_e_mail_na_posição(String string, String string2, String posicaoString) {
        int posicao = Integer.parseInt(posicaoString);
        String nomeEsperado = string;
        String emailEsperado = string2;

        WebElement elementoNome = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child("+posicaoString+") > td:nth-child(1)"));
        String nomeEncontrado = elementoNome.getText();

        WebElement elementoEmail = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child("+posicaoString+") > td:nth-child(2)"));
        String emailEncontrado = elementoEmail.getText();

        assertThat(nomeEncontrado).isEqualTo(nomeEsperado);
        assertThat(emailEncontrado).isEqualTo(emailEsperado);
    }

    @After
    public static void finalizar(){
        driver.quit();
    }
}
