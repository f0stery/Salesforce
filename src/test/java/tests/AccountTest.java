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
                .website("lms.teachmeskills.com")
                .build();
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password002!")
                .isPageOpened();
        accountListPage.open()
                .isPageOpened()
                .clickNew()
                .isPageOpened()
                .createAccount(account1)
                .clickSaveButton();
    }
}
