package testrunner;

import environment.Setup;
import org.testng.annotations.Test;
import pages.Browse;
import pages.ChangeProfile;
import pages.Signin;

public class Run extends Setup {

    @Test(priority = 1)
    public void signinrun(){
        driver.get("https://www.primevideo.com/");
        Signin signin = new Signin(driver);
        signin.signinamazon();
    }

    @Test(priority = 2)
    public void profileChange(){
        ChangeProfile changeProfile = new ChangeProfile(driver);
        changeProfile.nameChange();
    }

    @Test(priority = 3)
    public void playMov() throws InterruptedException {
        Browse browse = new Browse(driver);
        browse.play();
    }
}

