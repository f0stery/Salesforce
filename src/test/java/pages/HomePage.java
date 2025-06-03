package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static final String HOME_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/" +
            "setup/SetupOneHome/home";
    private static final By BUTTON_MENU = By.xpath("//div[contains(@class, 'slds-icon-waffle')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        driver.get(HOME_URL);
        return this;
    }

    @Override
    public HomePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_MENU));
        return this;
    }
}
