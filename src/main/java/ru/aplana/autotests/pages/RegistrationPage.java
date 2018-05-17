package ru.aplana.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotests.hooks.Hooks;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'page_inner')]")
    WebElement registrationPage;

    public RegistrationPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void selectField(String fieldName) {
        clickField(Hooks.getDriver(), By.xpath(".//*[contains(text(), '" + fieldName + "')]"), registrationPage);
    }

    public void fillField(String fieldName, String value) {
        registrationPage.findElement(By.xpath(".//*[@placeholder='" + fieldName + "']")).sendKeys(value);
    }

    public void expectedField(String fieldName) {
        expectedField(Hooks.getDriver(), By.xpath("//*[contains(text(), '" + fieldName + "')]"));
    }
}
