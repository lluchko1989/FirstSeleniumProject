package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void registrationPositiveTest() {

        int i = (int) (System.currentTimeMillis() / 1000);

        click(By.linkText("Register"));

        click(By.id("gender-female")); // можно male или female

        type(By.id("FirstName"), "Lidiya");
        type(By.id("LastName"), "Luchko");

        type(By.id("Email"), "l.luchko1989+" + i + "@gmail.com");

        type(By.id("Password"), "Aa12345!");
        type(By.id("ConfirmPassword"), "Aa12345!");

        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.className("register-continue-button")));
    }
}
