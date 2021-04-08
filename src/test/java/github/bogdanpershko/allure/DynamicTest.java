package github.bogdanpershko.allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class DynamicTest {

    private  String uuid = UUID.randomUUID().toString();
    @Test
    public void testDynamic(){
        open("https://github.com?session=" + uuid);

        Allure.getLifecycle().updateTestCase(tc -> {
            tc.setName("Динамический тест");
        });
        Allure.label("Owner", "pershkobogdan");
        Allure.feature("Работа с разметкой");
        Allure.story("Динамическая разметка");
        Allure.link("Logger",  "https://logdatabase.com?session" + uuid);

    }
}
