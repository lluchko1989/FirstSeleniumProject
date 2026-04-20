package homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccountTests extends TestBase {
    @Test
    public void registrationTest() {
        app.getBase().click(By.linkText("Register"));
        app.getBase().click(By.id("gender-male"));
        app.getBase().type(By.id("FirstName"), "Lidiya");
        app.getBase().type(By.id("LastName"), "Luchko");
        app.getBase().type(By.id("Email"), "l.luchko1989@mail.com");
        app.getBase().type(By.id("Password"), "Aa12345!");
        app.getBase().type(By.id("ConfirmPassword"), "Aa12345!");
        app.getBase().click(By.id("register-button"));

        Assert.assertTrue(app.getBase().isPresent(By.className("result")));



    }


}
