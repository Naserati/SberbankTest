package ru.aplana.autotests.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import ru.aplana.autotests.pages.RegistrationPage;

public class ScenarioSteps {
    BaseSteps baseSteps = new BaseSteps();
    SberbankSteps sberbankSteps = new SberbankSteps();
    SBOnlineSteps sbOnlineSteps = new SBOnlineSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();

    @When("^выполнено нажатие на \"(.+)\" на странице \"(.+)\"$")
    public void stepClickField(String fieldName, String page) {
        switch (page) {
            case "СБЕРБАНК":
                sberbankSteps.stepSelectField(fieldName);
                break;
            case "СБЕРБАНК ОНЛАЙН":
                sbOnlineSteps.stepSelectField(fieldName);
                break;
            case "РЕГИСТРАЦИЯ":
                registrationSteps.stepSelectField(fieldName);
        }
    }

    @When("^поле \"(.+)\" заполняется значением \"(.+)\"$")
    public void stepFillField(String fieldName, String value) {
        registrationSteps.stepFillField(fieldName, value);
    }

    @Then("^ожидается появление поля \"(.+)\"$")
    public void expectedField(String fieldName) {
        registrationSteps.stepExpectedField(fieldName);
    }
}
