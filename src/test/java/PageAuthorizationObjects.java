import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageAuthorizationObjects {
    WebDriver driver;

    String baseUrl = "https://navfront.preproduction.cdek.ru/#/viewLogin";
    public static WebElement login;
    WebElement password;
    WebElement loginButton;
    List<WebElement> local;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public PageAuthorizationObjects testFindAllObjectsOnPage() {
        login = driver.findElement(By.id("login"));
        password = driver.findElement(By.id("password"));
        loginButton = driver.findElement(By.xpath("//*[@id=\"target\"]/form/div[3]/div[3]/div/div[1]/button"));
        return this;
    }

    public void testFindLocal() {
        local = driver.findElements(By.xpath("//*[@id=\"target\"]/form/div[2]/ul/li"));
        for (WebElement element : local) {
            System.out.println(element.getText());
        }
    }
}