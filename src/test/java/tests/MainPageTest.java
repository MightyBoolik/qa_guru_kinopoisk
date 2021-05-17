package tests;

import allureAnnotations.JiraIssue;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.UserData.getTestPassword;
import static tests.UserData.getTestUsername;

public class MainPageTest extends TestBase {

    private String primaryTitle = "Выбор редакции",
            mainPage = ".desktop-layout-with-sidebar__content",
            loginButton = ".desktop-layout-with-sidebar .header-v4__user-bar",
            loginField = "#passp-field-login",
            passwordField = "#passp-field-passwd";


    @Test
    @Owner("Булат Кучаев")
    @Tag("web")
    @JiraIssue("QC3-36")
    @DisplayName("Проверка загрузки элемента на главной странице")
    void visibilityOnPage() {
        open("");
        $(mainPage).shouldHave(text(primaryTitle));
    }

    @Test
    @Owner("Булат Кучаев")
    @Tag("web")
    @JiraIssue("QC3-36")
    @DisplayName("Вход на сайт через учетную запись Yandex")
    void loginWithYandex() {
        open("");
        $(loginButton).shouldBe(visible).click();
        $(loginField).val(getTestUsername()).pressEnter();
        $(passwordField).val(getTestPassword()).pressEnter();
        $(mainPage).shouldHave(text(primaryTitle));
    }
}
