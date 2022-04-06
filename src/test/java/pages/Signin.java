package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Signin {
    WebDriver driver;
    WebDriverWait wait;

    public Signin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='pv-nav-sign-in']")
    List <WebElement> btnSignIn;
    @FindBy(id = "ap_email")
    WebElement inputEmail;
    @FindBy(id = "ap_password")
    WebElement inputPass;
    @FindBy(id = "signInSubmit")
    WebElement btnSubmit;

    public void signinamazon(){
        btnSignIn.get(0).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(inputEmail));
        inputEmail.sendKeys("hcrusedtd5227@outlook.com");
        inputPass.sendKeys("amar1234");
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        btnSubmit.click();
    }
}
