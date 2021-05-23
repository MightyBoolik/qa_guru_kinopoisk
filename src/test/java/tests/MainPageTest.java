package tests;

import allureAnnotations.JiraIssue;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
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
    @JiraIssue("TESTS-14")
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
        $x("//div[@class='desktop-layout-with-sidebar__header']").shouldHave(text("Попробовать плюс")).click();
        $(".header__inner .burger-menu").click();
        /*$(loginButton).shouldBe(visible).click();
        $(loginField).val(getTestUsername()).pressEnter();
        $(passwordField).val(getTestPassword()).pressEnter();
        $(mainPage).shouldHave(text(primaryTitle));
    */
    }
}