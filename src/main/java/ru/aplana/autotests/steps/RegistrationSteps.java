package ru.aplana.autotests.steps;

import ru.aplana.autotests.pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationSteps {
    RegistrationPage registrationPage = new RegistrationPage();

    @Step
    public void stepSelectField(String fieldName) {
        registrationPage.selectField(fieldName);
    }

    @Step
    public void stepFillField(String fieldName, String value) {
        registrationPage.fillField(fieldName, value);
    }

    @Step
    public void stepExpectedField(String fieldName) {
        registrationPage.expectedField(fieldName);
    }
}
