package github.bogdanpershko.allure;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тест сценарий для ДЗ")
public class AnnotatedStepsTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static int ISSUE_NUMBER = 68;

    private  WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Это мой не любимый тест")
    public void testSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.clickForIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}


