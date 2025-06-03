package tests;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password002!")
                .isPageOpened();
        accountListPage.open()
                .isPageOpened()
                .clickNew()
                .isPageOpened()
                .createAccount("TSM",
                        "+37291322322", "+37291322322",
                        "Cold", "2",
                        "teachmeskills.com", "Other",
                        "Other", "Telecommunications",
                        "SIC", true,
                        true, "Brothers Lizukovi",
                        "1-23-2", "Belarus")
                .clickSaveButton();
    }
}
