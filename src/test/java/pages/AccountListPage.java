package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountListPage extends BasePage {

    private static final String ACCOUNT_LIST_URL = "https://tms9-dev-ed.develop.lightning.force.com/" +
            "lightning/o/Account/list";
    private static final By BUTTON_NEW = By.xpath("//*[@title='New']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountListPage open() {
        driver.get(ACCOUNT_LIST_URL);
        return this;
    }

    @Override
    public AccountListPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_NEW));
        return this;
    }

    public NewAccountModal clickNew() {
        driver.findElement(BUTTON_NEW).click();
        return new NewAccountModal(driver);
    }
}
