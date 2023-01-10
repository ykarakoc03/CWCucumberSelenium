package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class AmazonSearchPage {


    private WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "s-breadcrumb")
    private WebElement resultText;


    public void validateResultTextHasKey(String key){
        Assert.assertTrue(resultText.getText().contains(key));
    }


}
