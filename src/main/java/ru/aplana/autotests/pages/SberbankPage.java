package ru.aplana.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotests.hooks.Hooks;
import ru.aplana.autotests.steps.BaseSteps;

import java.awt.*;


public class SberbankPage extends BasePage {

    @FindBy(xpath = "//body[contains(@class, 'bgcolor-main')]")
    WebElement mainPage;

    public SberbankPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void selectField(String fieldName) {
        clickField(Hooks.getDriver(), By.xpath(".//*[contains(text(), '" + fieldName + "')]"), mainPage);
    }
}
