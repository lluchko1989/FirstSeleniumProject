import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewPage {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().browserVersion("146").setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void newPage() {
        System.out.println("Open page");

    }

    @Test
    public void find10Elements() {
        driver.findElement(By.linkText("Books"));
        driver.findElement(By.linkText("Computers"));
        driver.findElement(By.linkText("Electronics"));
        driver.findElement(By.linkText("Apparel & Shoes"));
        driver.findElement(By.linkText("Digital downloads"));
        driver.findElement(By.linkText("Jewelry"));
        driver.findElement(By.linkText("Gift Cards"));

        driver.findElement(By.id("small-searchterms"));
        driver.findElement(By.id("newsletter-email"));
        driver.findElement(By.linkText("Contact us"));
    }
    @Test
    public void findTenElementsCss() {
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.cssSelector("a[href='/register']"));
        driver.findElement(By.cssSelector("a[href='/login']"));
        driver.findElement(By.cssSelector("a[href='/cart']"));
        driver.findElement(By.cssSelector("a[href='/wishlist']"));
        driver.findElement(By.cssSelector("a[href='/books']"));
        driver.findElement(By.cssSelector("a[href='/computers']"));
        driver.findElement(By.cssSelector("a[href='/electronics']"));
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector("#newsletter-email"));
        driver.findElement(By.cssSelector("a[href='/contactus']"));
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
