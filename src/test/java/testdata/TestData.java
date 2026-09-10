package testdata;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;

public class TestData {

    Faker faker = new Faker();

    public  String name = faker.name().fullName();
    public  String email = faker.internet().emailAddress();
    public  String phone = faker.phoneNumber().subscriberNumber(12);
    public  String language = faker.options().option("English", "Русский(Russian)");
    public  String password = faker.internet().password();
    public  String textSuccessfulAuthorizationForm = "История заказов";

    private final SelenideElement passwordConfirmationInput = $("#client_password_confirmation");



}