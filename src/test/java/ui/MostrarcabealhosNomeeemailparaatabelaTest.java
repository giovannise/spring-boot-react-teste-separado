package ui;

// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MostrarcabealhosNomeeemailparaatabelaTest extends BaseTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void mostrarcabealhosNomeeemailparaatabela() {
        carregarPaginaInicial();
        assertThat(clientesPage.obterTextoPrimeiroCabecalho(), is("Nome"));;
        assertThat(clientesPage.obterTextoSegundoCabecalho(), is("E-mail"));;
    }

    @Test
    public void excluirPrimeiroClienteDaLista() throws InterruptedException {
        driver.get("http://localhost:3000/clients");
        driver.manage().window().setSize(new Dimension(1442, 813));
        String primeiroNomeNaLista;
        WebElement elementoPrimeiroNomeNaLista;
        elementoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        primeiroNomeNaLista = elementoPrimeiroNomeNaLista.getText();
        System.out.println(primeiroNomeNaLista);
        WebElement botaoApagarDoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > button"));
        botaoApagarDoPrimeiroNomeNaLista.click();
        elementoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        primeiroNomeNaLista = elementoPrimeiroNomeNaLista.getText();
        System.out.println(primeiroNomeNaLista);
    }

}
