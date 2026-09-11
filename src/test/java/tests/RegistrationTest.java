package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testdata.TestData;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class RegistrationTest extends TestBase {

    TestData testData = new TestData();

    @Test
    @DisplayName("Регистрация со всеми заполненными полями валидными данными")
    void successfulAuthorizationTest() {
        step("Открытие страницы регистрации", () -> {
            registrationTestPage
                    .openPage();
        });
        step("Ввод валидных данных", () -> {
            registrationTestPage
                    .typeName(testData.name)
                    .typePhone(testData.phone)
                    .typeEmail(testData.email)
                    .typeLanguage(testData.language)
                    .typePassword(testData.password)
                    .typePasswordConfirmation(testData.password)
                    .typePersonalData()
                    .submit();
        });
        step("Проверка успешной регистрации", () -> {
            registrationTestPage
                    .chekOrderHistory(testData.textSuccessfulRegistrationForm)
                    .notVisibleRegistrationWindow();
        });
    }

    @Test
    @DisplayName("Отправка пустой формы регистрации")
    void allInputFieldsEmptyTest() {
        step("Открытие страницы регистрации", () -> {
            registrationTestPage
                    .openPage();
        });
        step("Нажать кнопку регистрации", () -> {
            registrationTestPage
                    .submit();
        });
        step("Проверка ошибки", () -> {
            registrationTestPage
                    .visibleRegistrationWindow()
                    .chekErrorField(testData.textErrorAuthorizationForm);
        });
    }
}
