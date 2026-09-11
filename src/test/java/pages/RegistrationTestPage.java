package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTestPage {

    private final SelenideElement nameInput = $("#client_contact_name");
    private final SelenideElement phoneInput = $("#client_phone");
    private final SelenideElement emailInput = $("#client_email");
    private final SelenideElement languageInput = $("#client_language_id");
    private final SelenideElement passwordInput = $("#client_password");
    private final SelenideElement passwordConfirmationInput = $("#client_password_confirmation");
    private final SelenideElement checkboxPersonalData = $(".co-input--consent_to_personal_data");
    private final SelenideElement submitButton = $(".js-co-login-submit");
    private final SelenideElement orderHistoryPage = $(".co-checkout-title");
    private final SelenideElement registrationWindow = $("#new_client");
    private final SelenideElement errorField = $(".co-notice--danger");

    @Step("Открытие страницы регистрации /client_account/contacts/new")
    public RegistrationTestPage openPage() {
        open("/client_account/contacts/new");
        return this;
    }

    @Step("Ввод имени \"{value}\"")
    public RegistrationTestPage typeName(String value) {
        nameInput.setValue(value);
        return this;
    }

    @Step("Ввод номера телефона \"{value}\"")
    public RegistrationTestPage typePhone(String value) {
        phoneInput.setValue(value);
        return this;
    }

    @Step("Ввод email \"{value}\"")
    public RegistrationTestPage typeEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    @Step("Выбор языка \"{value}\"")
    public RegistrationTestPage typeLanguage(String value) {
        languageInput.$(byText(value)).click();
        return this;
    }

    @Step("Ввод пароля \"{value}\"")
    public RegistrationTestPage typePassword(String value) {
        passwordInput.setValue(value);
        return this;
    }

    @Step("Повторный ввод пароля \"{value}\"")
    public RegistrationTestPage typePasswordConfirmation(String value) {
        passwordConfirmationInput.setValue(value);
        return this;
    }

    @Step("Согласие с правилами")
    public RegistrationTestPage typePersonalData() {
        checkboxPersonalData.click();
        return this;
    }

    @Step("Нажатие кнопки регистрации ")
    public RegistrationTestPage submit() {
        submitButton.click();
        return this;
    }

    @Step("Вывод окна истории заказов")
    public RegistrationTestPage chekOrderHistory(String value) {
        orderHistoryPage.shouldBe(visible);
        orderHistoryPage.shouldHave(text(value));
        return this;
    }

    @Step("Окно регистрации НЕ отображается")
    public RegistrationTestPage notVisibleRegistrationWindow() {
        registrationWindow.shouldNotBe(visible);
        return this;
    }

    @Step("Окно регистрации отображается")
    public RegistrationTestPage visibleRegistrationWindow() {
        registrationWindow.shouldBe(visible);
        return this;
    }

    @Step("Вывод ошибки регистрации с текстом \"{value}\"")
    public RegistrationTestPage chekErrorField(String value) {
        errorField.shouldHave(text(value));
        return this;
    }
}

