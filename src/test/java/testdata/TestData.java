package testdata;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;

public class TestData {

    Faker faker = new Faker();

    public  String name = faker.name().fullName();
    public  String email = faker.internet().emailAddress();
    public  String errorEmail = faker.name().name();
    public  String phone = faker.phoneNumber().subscriberNumber(12);
    public  String language = faker.options().option("English", "Русский(Russian)");
    public  String password = faker.internet().password();
    public  String passwordLength = faker.internet().password(1, 5);
    public  String textSuccessfulRegistrationForm = "История заказов";
    public  String textErrorAuthorizationForm = "Поле не заполнено";
    public  String textErrorPasswordLength = "Пароль должен быть не меньше 6 символов";
    public  String textErrorMail = "Адрес электронной почты указан неверно";

}