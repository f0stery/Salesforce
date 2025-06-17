package tests;

import dto.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        Account account1 = Account.builder()
                .name("Evgeny")
                .phone("+375296163232")
                .isVip(true)
                .isTms(true)
                .build();
        Account account = new Account("TSM",
                "+37291322322", "+37291322322",
                "Cold", "2",
                "teachmeskills.com", "Other",
                "Other", "Telecommunications",
                "SIC", true,
                true, "Brothers Lizukovi",
                "1-23-2", "Belarus");
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password002!")
                .isPageOpened();
        accountListPage.open()
                .isPageOpened()
                .clickNew()
                .isPageOpened()
                .createAccount(account)
                .clickSaveButton();
    }
}
