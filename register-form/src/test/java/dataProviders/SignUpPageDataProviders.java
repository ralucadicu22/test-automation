package dataProviders;

import org.testng.annotations.DataProvider;

public class SignUpPageDataProviders {
    @DataProvider(name = "signUpPageDataProvider")
    public Object[][] signUpPageDataProvider(){
        return new Object[][]{
                {"chrome",true},
                {"edge", true},
                {"safari", false}
        };
    }
}
