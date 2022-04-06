package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browse {
    WebDriver driver;
    WebDriverWait wait;

    public Browse(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//    @FindBy(className = "pv-nav-main-menu-label")
//    WebElement btnBrowse;
//    @FindBy(id = "pv-nav-home")
//    WebElement goToHomeAgain;
    @FindBy(xpath = "//img[src='https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/" +
            "f539f7106f54f6e76745892ab9e957d164f7f52d94084f2145d9258c4d6d70a0._UR1920,1080_RI_SX356_FMjpg_.jpg']")
    WebElement playSeries;

    public void play() throws InterruptedException {
//        btnBrowse.click();
//        goToHomeAgain.click();
//        Thread.sleep(3000);
        playSeries.click();
    }
}
