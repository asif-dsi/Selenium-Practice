package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeProfile {
    WebDriver driver;
    WebDriverWait wait;

    public ChangeProfile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='nav-profiles-dropdown-label']")
    WebElement changeProfile;
    @FindBy(id = "profile-3")
    WebElement profileAsif;

    public void nameChange(){
        changeProfile.click();
        profileAsif.click();
    }

}
