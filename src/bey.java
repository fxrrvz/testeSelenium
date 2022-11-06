import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class bey {
    
    public WebDriver driver;
    
    @BeforeClass
    public static void configuraDriver() {
		System.setProperty("webdriver.edge.driver", "E:\\uff\\devweb\\testeSelenium\\src\\selenium\\msedgedriver.exe");
	}
    
    @Before
    public void createDriver(){
        driver = new EdgeDriver();
        driver.get("https://www.google.com.br");  
    }
    
    @Test
    public void testaTituloBuscaGoogle() throws InterruptedException {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("manoel gomes");
		search.submit();		
		assertTrue("Título da página difere do esperado", driver.getTitle().contentEquals("teste de software - Pesquisa Google"));		
	}
    
    @After
	public void quitDriver() {
		driver.quit();
	}
}
