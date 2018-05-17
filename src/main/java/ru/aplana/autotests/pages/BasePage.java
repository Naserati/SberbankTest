package ru.aplana.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotests.hooks.Hooks;
import ru.aplana.autotests.steps.BaseSteps;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    private boolean isElementPresent(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void expectedField(WebDriver driver, By locator) {
        if (!isElementPresent(driver, locator)) {
            Assert.fail("Поле не найдено");
        }
    }

    public void clickField(WebDriver driver, By locator, WebElement element) {
        if (isElementPresent(driver, locator)) {
            element.findElement(locator).click();
        }
        else Assert.fail("Невозможно нажать на поле");
    }
}
