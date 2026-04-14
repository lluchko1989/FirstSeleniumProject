package de.phonebook.tests;

import io.github.bonigarcia.wdm.WebDriverManager; // 👈 ВАЖНО ДОБАВИТЬ
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // 👈 ВОТ ЭТА СТРОКА РЕШАЕТ ОШИБКУ
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By by) {
        return driver.findElements(by).size() > 0;
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void type(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
}
