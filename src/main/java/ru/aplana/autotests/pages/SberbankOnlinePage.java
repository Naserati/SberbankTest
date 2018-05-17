package ru.aplana.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotests.hooks.Hooks;
import ru.aplana.autotests.steps.BaseSteps;

public class SberbankOnlinePage extends BasePage {

    @FindBy(xpath = "//body[contains(@class, 'noJS')]")
    WebElement sbOnlinePage;

    public SberbankOnlinePage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void selectField(String fieldName) {
        clickField(Hooks.getDriver(), By.xpath(".//*[contains(text(), '"+fieldName+"')]"), sbOnlinePage);
    }
}
