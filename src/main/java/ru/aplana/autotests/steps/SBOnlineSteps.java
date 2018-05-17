package ru.aplana.autotests.steps;

import ru.aplana.autotests.pages.SberbankOnlinePage;
import ru.yandex.qatools.allure.annotations.Step;

public class SBOnlineSteps {
    SberbankOnlinePage sbOnlinePage = new SberbankOnlinePage();

    @Step
    public void stepSelectField(String fieldName) {
        sbOnlinePage.selectField(fieldName);
    }
}
