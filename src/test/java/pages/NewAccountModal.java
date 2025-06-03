package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.CheckBox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    private static final String ACCOUNT_CREATE_URL =
            "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new";
    private static final By ACCOUNT_SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal open() {
        driver.get(ACCOUNT_CREATE_URL);
        return this;
    }

    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_SAVE_BUTTON));
        return this;
    }

    public NewAccountModal createAccount(Account account) {

        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Account Number").write(account.getAccountNum());
        new Input(driver, "Website").write(account.getWebsite());
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new CheckBox(driver, "TeachMeSkills").setChecked(account.isTms());
        new CheckBox(driver, "VIP Client").setChecked(account.isVip());
        new TextArea(driver, "Billing Street").writeArea(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").writeArea(account.getShippingStreet());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return this;
    }

    public HomePage clickSaveButton() {
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
        return new HomePage(driver);
    }
}
