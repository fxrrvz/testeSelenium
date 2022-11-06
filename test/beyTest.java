import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class beyTest {
    
    public WebDriver driver;
    
    @BeforeClass
    public static void configuraDriver() {
		System.setProperty("webdriver.edge.driver", "E:\\uff\\devweb\\testeSelenium\\src\\selenium\\msedgedriver.exe");
	}
    
    @Before
    public void createDriver(){
        driver = new EdgeDriver();
        driver.get("https://pt.wikipedia.org");
    }
    
    @Test
    public void testaTituloBuscaGoogle() throws InterruptedException {
		WebElement btnsearch = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/a"));
		btnsearch.click();
                WebElement search = driver.findElement(By.name("search"));
                search.sendKeys("beyonce");
		search.submit();
                WebElement idade = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[5]/td[2]/span/a[1]"));
                System.out.println(idade.toString());
		assertTrue("Idade difere do esperado", idade.getText().contentEquals("4 de setembro"));		
	}
            
    
    /*@After
	public void quitDriver() {
		driver.quit();
	}*/
}
