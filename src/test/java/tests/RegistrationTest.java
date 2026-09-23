package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testdata.TestData;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class RegistrationTest extends TestBase {

    TestData testData = new TestData();

    @Test
    @DisplayName("Регистрация со всеми заполненными полями валидными данными")
    void successfulRegistrationTest() {
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

    @Test
    @DisplayName("Отправка формы регистрации c пустым Checkbox")
    void checkboxNotChecked() {
        step("Открытие страницы регистрации", () -> {
            registrationTestPage
                    .openPage();
        });
        step("Ввод валидных данных с пропуском Checkbox", () -> {
            registrationTestPage
                    .typeName(testData.name)
                    .typePhone(testData.phone)
                    .typeEmail(testData.email)
                    .typeLanguage(testData.language)
                    .typePassword(testData.password)
                    .typePasswordConfirmation(testData.password)
                    .submit();
        });
        step("Проверка ошибки", () -> {
            registrationTestPage
                    .chekErrorCheckbox(testData.textErrorAuthorizationForm);
        });
    }

    @Test
    @DisplayName("Отправка формы регистрации с коротким паролем")
    void shortPasswordRegistration() {
        step("Открытие страницы регистрации", () -> {
            registrationTestPage
                    .openPage();
        });
        step("Ввод валидных данных с коротким паролем", () -> {
            registrationTestPage
                    .typeName(testData.name)
                    .typePhone(testData.phone)
                    .typeEmail(testData.email)
                    .typeLanguage(testData.language)
                    .typePassword(testData.passwordLength)
                    .typePasswordConfirmation(testData.passwordLength)
                    .typePersonalData()
                    .submit();
        });
        step("Проверка ошибки", () -> {
            registrationTestPage
                    .chekErrorPasswordLength(testData.textErrorPasswordLength);
        });
    }

    @Test
    @DisplayName("Отправка формы регистрации с невалидеым Mail")
    void invalidPasswordRegistration() {
        step("Открытие страницы регистрации", () -> {
            registrationTestPage
                    .openPage();
        });
        step("Ввод данных с невалидеым Mail", () -> {
            registrationTestPage
                    .typeName(testData.name)
                    .typePhone(testData.phone)
                    .typeEmail(testData.errorEmail)
                    .typeLanguage(testData.language)
                    .typePassword(testData.passwordLength)
                    .typePasswordConfirmation(testData.passwordLength)
                    .typePersonalData()
                    .submit();
        });
        step("Проверка ошибки", () -> {
            registrationTestPage
                    .chekErrorPasswordLength(testData.textErrorMail);
        });
    }
}
