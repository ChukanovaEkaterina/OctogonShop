package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testdata.TestData;

public class AuthorizationTest extends TestBase {

    TestData testData = new TestData();

    @Test
    @DisplayName("Авторизация с валидными данными")
    void successfulAuthorizationTest() {
        authorizationTestPage
                .openPage()
                .typeLogin(testData.login)
                .typePassword(testData.password)
                .submit();
    }
}
