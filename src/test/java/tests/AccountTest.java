package tests;

import org.testng.annotations.Test;

import static pages.NewAccountModal.*;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password002!");
        waitLocator(getBurgerMenu());
        newAccountModal.openUrlCreateAccount();
        waitLocator(getAccountSaveButton());
        newAccountModal.createAccount("TSM",
                "+37291322322", "+37291322322",
                "Cold", "2",
                "teachmeskills.com", "Other",
                "Other", "Telecommunications",
                "SIC", false,
                true, "Brothers Lizukovi",
                "1-23-2", "Belarus"
                );
        newAccountModal.clickSaveButton();
    }
}
