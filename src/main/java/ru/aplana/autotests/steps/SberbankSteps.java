package ru.aplana.autotests.steps;

import org.openqa.selenium.WebElement;
import ru.aplana.autotests.pages.SberbankPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SberbankSteps {

    SberbankPage sberbankPage = new SberbankPage();

    @Step
    public void stepSelectField(String fieldName) {
        sberbankPage.selectField(fieldName);
    }
}
