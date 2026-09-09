package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTestPage {

    private final SelenideElement loginInput = $("#email");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement submitButton = $(".js-co-login-submit");


    private final SelenideElement formModal = $("#example-modal-sizes-title-lg");
    private final SelenideElement tableHover = $(".table-hover");

    @Step("Открытие страницы авторизации /client_account/session/new")
    public AuthorizationTestPage openPage() {
        open("/client_account/session/new");
        return this;
    }

    @Step("Ввод логина (телефон или Email) \"{value}\"")
    public AuthorizationTestPage typeLogin(String value) {
        loginInput.setValue(value);
        return this;
    }

    @Step("Ввод пароля \"{value}\"")
    public AuthorizationTestPage typePassword(String value) {
        passwordInput.setValue(value);
        return this;
    }

    @Step("Клик по кнопке \"Войти\"")
    public AuthorizationTestPage submit() {
        submitButton.click();
        return this;
    }
}

//
//    @Step("Type User Email \"{value}\"")
//    public AuthorizationTestPage typeUserEmail(String value){
//        userEmailInput.setValue(value);
//        return this;
//   }
//
//   @Step("Type Gender \"{value}\"")
//   public AuthorizationTestPage setGender(String value){
//       genderWrapperInput.$(byText(value)).click();
//        return this;
//   }
//
//   @Step("Type User Number \"{value}\"")
//   public AuthorizationTestPage typeUserNumber(String value){
//        userNumberInput.setValue(value);
//        return this;
//   }
//
//   @Step("Type Date Of Birth \"{day} {month} {year} \"")
//   public AuthorizationTestPage setDateOfBirth(String day, String month, String year){
//        dateOfBirthInput.click();
//        calendar.setDate(day, month, year);
//        return this;
//   }
//
//   @Step("Set Subjects \"{value}\"")
//   public AuthorizationTestPage setSubjects(String value){
//       subjectsInput.setValue(value).pressEnter();
//       return this;
//   }
//
//    @Step("Set Hobbies \"{value}\"")
//    public AuthorizationTestPage setHobbies(String value){
//        hobbiesWrapperInput.$(byText(value)).click();
//        return this;
//    }
//
//    @Step("Upload picture")
//    public AuthorizationTestPage pictureUpload(String value){
//        pictureUploadInput.uploadFromClasspath(value);
//        return this;
//    }
//
//    @Step("Set Current Address \"{value}\"")
//    public AuthorizationTestPage typeCurrentAddress(String value) {
//        currentAddressInput.setValue(value);
//        return this;
//    }
//
//    public AuthorizationTestPage setState(String value) {
//        stateInput.click();
//        stateCityWrapper.$(byText(value)).click();
//        return this;
//    }
//
//    public AuthorizationTestPage setCity(String value) {
//        cityInput.click();
//        stateCityWrapper.$(byText(value)).click();
//        return this;
//    }
//
//    @Step("Set State and City \"{state} add {city} \"")
//    public AuthorizationTestPage setStateAndCity(String state, String city) {
//        setState(state);
//        setCity(city);
//        return this;
//    }
//
//
//
//    @Step("Chek Modal form")
//    public AuthorizationTestPage chekFormModal(String value) {
//        formModal.shouldBe(visible);
//        formModal.shouldHave(text(value));
//        return this;
//    }
//
//    @Step("Check result  form component \"{key} {value} \"")
//    public AuthorizationTestPage checkResult(String key, String value){
//        resultFormComponent.chekField(key,value);
//        return this;
//    }
//
//    @Step("Table Hover not be visible")
//    public AuthorizationTestPage notVisibleTableHover(){
//        tableHover.shouldNotBe(visible);
//        return this;
//    }
//
//    @Step("Check error user number")
//    public AuthorizationTestPage checkErrorUserNumber(){
//        userNumberInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
//        return this;
//    }
//
//    @Step("Check error user Email")
//    public AuthorizationTestPage checkErrorUserEmail(){
//        userEmailInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
//        return this;
//    }
//
//    @Step("Check error user First Name")
//    public AuthorizationTestPage checkErrorFirstName(){
//        firstNameInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
//        return this;
//    }
//
//    @Step("Check error user Last Name")
//    public AuthorizationTestPage checkErrorLastName(){
//        lastNameInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
//        return this;
//    }
//}
