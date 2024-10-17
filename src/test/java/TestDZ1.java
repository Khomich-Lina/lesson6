import org.example.Pages.AccountPage;
import org.example.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDZ1 {

    WebDriver driver;
    LoginPage loginPage;
    AccountPage accountPage;

    @BeforeTest
    public void setupDriver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://avtogrand.com.ua/ua/login/");
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }

    @Test
    public void myTest() {
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.submitLogin();
        Assert.assertEquals( accountPage.getText(),"Особистий кабінет");

    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
