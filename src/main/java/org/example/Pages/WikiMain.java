package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WikiMain {

   private WebDriver driver;
   private WebDriverWait wait;

   public WikiMain (WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }

   @FindBy(xpath = "//*[@id='pt-login']")
    WebElement loginClick;

        public void loginClick(){
        loginClick.click();
        }
}
