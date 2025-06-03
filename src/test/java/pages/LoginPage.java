package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private static final By USER_NAME_FIELD = By.id("username"),
    PASSWORD_FIELD = By.id("password"),
    LOGIN_BUTTON = By.id("Login"),
    TITLE_TEXT_SETUP = By.xpath("//span[@title='Setup']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы Login Page")
    @Override
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        waiting.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Step ("Вход в систему с именем пользователя: {user} и паролем: {password}")
    public HomePage login (String user, String password) {
        driver.findElement(USER_NAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }

    public String getTitleTextSetup() {
        return driver.findElement(TITLE_TEXT_SETUP).getText();
    }
}
