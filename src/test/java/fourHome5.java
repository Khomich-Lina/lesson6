import org.example.Pages.Dogfeet;
import org.example.Pages.MainPage;
import org.example.Pages.ShopCategory;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class fourHome5 {

    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    ShopCategory shopCategory;
    Dogfeet dogfeet;

    @BeforeTest
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://101dalmatin.ua/");
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        shopCategory = new ShopCategory(driver);
        dogfeet = new Dogfeet(driver);
    }

    @Test
    public void form(){
        mainPage.showcategory();
        shopCategory.clickOnCategory();
        dogfeet.buttOnKoshuk();

    }


    @Test
    public void secondtest(){

        mainPage.showCategory();
        shopCategory.clickkorm();
        dogfeet.buttonInKoshuk();

    }



    @Test
    public void searchInputTest() {

        mainPage.shoWCategory();
        shopCategory.clicKkorm();
        dogfeet.buttonInKoshuK();

    }



    @AfterTest
    public void closeTest(){
        driver.quit();


    }

}
