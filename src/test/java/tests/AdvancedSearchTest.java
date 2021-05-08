package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AdvancedSearchTest extends TestBase {
    @Test
    void searchByGenre() {
        open("https://www.kinopoisk.ru/");
        $(".kinopoisk-header-search-form-input__control-container a").click();


    }
}
