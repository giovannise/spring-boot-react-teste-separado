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

public class MostrarcabealhosNomeeemailparaatabelaTestOld {

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
        driver.get("http://localhost:3000/clients");
        driver.manage().window().setSize(new Dimension(1442, 813));
        assertThat(driver.findElement(By.cssSelector("th:nth-child(1)")).getText(), is("Nome"));
        assertThat(driver.findElement(By.cssSelector("th:nth-child(2)")).getText(), is("E-mail"));
    }

    @Test
    public void excluirPrimeiroClienteDaLista() {
        driver.get("http://localhost:3000/clients");
        driver.manage().window().setSize(new Dimension(1442, 813));
        String primeiroNomeNaLista;
        WebElement elementoPrimeiroNomeNaLista;
        elementoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        primeiroNomeNaLista = elementoPrimeiroNomeNaLista.getText();
        System.out.println(primeiroNomeNaLista);
        WebElement botaoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > button"));
        botaoPrimeiroNomeNaLista.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementoPrimeiroNomeNaLista = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        primeiroNomeNaLista = elementoPrimeiroNomeNaLista.getText();
        System.out.println(primeiroNomeNaLista);

    }
}

