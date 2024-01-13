package tests;

import dataProviders.SignUpPageDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import tests.BaseUITest;
import tests.utils.SeleniumUtils;

public class SignUpPageTest extends BaseUITest {
    @Test(dataProvider = "signUpPageDataProvider",dataProviderClass = SignUpPageDataProviders.class)
    public void testIfSignUpPageIsAvailable(String browserType,boolean exceptedAvailability){
        driver= SeleniumUtils.getDriver(browserType);
        SignUpPage signUpPage=new SignUpPage(driver);
        boolean isPageAvailable=signUpPage.open(pageUnderTestUrl);
        Assert.assertEquals(isPageAvailable,exceptedAvailability);

    }

}
