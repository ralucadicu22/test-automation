package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void searchOnGoogle(){
        webDriver=new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement acceptCookiesButton= webDriver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();
        WebElement searchInput=webDriver.findElement(By.name("q"));
        searchInput.sendKeys("Google Atelierul Digital", Keys.ENTER);
        WebElement googleAtelierulDigitalLink=webDriver.findElement(By.xpath("//*[@id=\"gsr\"]"));
    }


}
