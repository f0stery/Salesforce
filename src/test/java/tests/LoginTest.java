package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test(testName = "Удачный вход", description = "Удачный логин")
    public void checkSuccessLogin() {
        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password002!");
        assertEquals(loginPage.getTitleTextSetup(),
                "Setup",
                "Авторизация не прошла");
    }
}
