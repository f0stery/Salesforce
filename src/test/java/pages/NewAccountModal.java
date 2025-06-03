package pages;

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
        waiting.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_SAVE_BUTTON));
        return this;
    }

    public NewAccountModal createAccount(String name, String phone, String fax,
                              String rating, String accountNum, String website,
                              String type, String ownership, String industry,
                              String sicCode,  boolean isTMS, boolean isVip,
                              String BillingStreet, String ShippingStreet, String ShippingCountry) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Account Number").write(accountNum);
        new Input(driver, "Website").write(website);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "SIC Code").write(sicCode);
        new CheckBox(driver, "TeachMeSkills").setChecked(isTMS);
        new CheckBox(driver, "VIP Client").setChecked(isVip);
        new TextArea(driver, "Billing Street").writeArea(BillingStreet);
        new TextArea(driver, "Shipping Street").writeArea(ShippingStreet);
        new Input(driver, "Shipping Country").write(ShippingCountry);
        return this;
    }

    public HomePage clickSaveButton() {
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
        return new HomePage(driver);
    }
}
