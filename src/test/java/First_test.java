import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class First_test extends PageAuthorizationObjects {


    @Test
    public void testAuthorization() throws Exception {
//        driver.get(baseUrl);
        testFindAllObjectsOnPage();
        login.clear();
        login.sendKeys("Авак Денис Викторович");
        password.clear();
        password.sendKeys("26145496");
        loginButton.click();

    }



    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

}
