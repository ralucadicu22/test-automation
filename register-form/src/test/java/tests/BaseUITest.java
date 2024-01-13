package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tests.utils.SeleniumUtils;

import java.io.IOException;
import java.util.Properties;

public class BaseUITest {
    WebDriver driver;
    String url;
    String path;
    String pageUnderTestUrl;
    String browser;

    @BeforeClass
    public void setUp() throws IOException {
        Properties properties= SeleniumUtils.readProperties("src\\test\\resources\\application.properties");
        url=properties.getProperty("url");
        path=properties.getProperty("path");
        pageUnderTestUrl=url+path;
        browser=properties.getProperty("browser");
        System.out.println("Browser " + browser);
        System.out.println("Page Under Test " + pageUnderTestUrl);
    }

    @AfterClass
    public void close(){
        //close the browser
//        if(driver!=null){
//            driver.quit();
//        }
    }
}
