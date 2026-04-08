import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewPage {
    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        WebDriverManager.chromedriver().browserVersion("146").setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }
    @Test
    public void newPage (){
        System.out.println("Open page");

    }
    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

}
