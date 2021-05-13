package tests;

import allureAnnotations.JiraIssue;
import config.DriverConfig;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.UserData.getTestPassword;
import static tests.UserData.getTestUsername;

public class MainPageTest extends TestBase {

    private final String primaryTitle = "Выбор редакции";

    @Test
    @DisplayName("Проверка загрузки элемента на главной странице")
    @Owner("Булат Кучаев")
    @Tag("web")
    @JiraIssue("QC3-36")
    void visibilityOnPage() {
        open("");
        $(".desktop-layout-with-sidebar__content").shouldHave(text(primaryTitle));
    }

    @Test
    @DisplayName("Вход на сайт через учетную запись Yandex")
    @Owner("Булат Кучаев")
    @Tag("web")
    @JiraIssue("QC3-36")
    void loginWithYandex() {
        open("");
        $(".desktop-layout-with-sidebar .header-v4__user-bar").shouldBe(visible).click();
        $("#passp-field-login").val(getTestUsername()).pressEnter();
        $("#passp-field-passwd").val(getTestPassword()).pressEnter();
        $(".desktop-layout-with-sidebar__content").shouldHave(text(primaryTitle));
    }
}
