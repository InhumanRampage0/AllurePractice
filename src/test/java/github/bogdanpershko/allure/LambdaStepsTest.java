package github.bogdanpershko.allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Тест сценарий для ДЗ")
public class LambdaStepsTest {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static int ISSUE_NUMBER = 68;


    @Test
    @Owner("pershkobogdan")
    @DisplayName("Пример теста с лябда степами")
    @Story("Работа с Аллюром")
    public void searchForIssue() {
        Allure.parameter("Repository", REPOSITORY);
        Allure.parameter("Issue number", ISSUE_NUMBER);

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий", () -> {
            $(By.linkText("eroshenkoam/allure-example")).click();
                });
        step("Переходим в таб Issues", () -> {
            $(withText("Issues")).click();
                });
        step("Проверям что Issues с номером 68 существует", () -> {
            $(withText("#68")).should(Condition.exist);
        });

    }
}
