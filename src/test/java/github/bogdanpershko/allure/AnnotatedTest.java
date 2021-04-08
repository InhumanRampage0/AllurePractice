package github.bogdanpershko.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Набор тестов с аннотациями")
public class AnnotatedTest {

    @Test
    @Owner("pershkobogdan")
    @Feature("Работа с разметкой")
    @Story("Разметка с аннотацией")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Пример теста с аннотациями")
    @Link(name = "BaseURL", url = "https://github.com")
    public void testSomething() {

    }
}
