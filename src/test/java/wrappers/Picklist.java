package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Picklist {

    WebDriver driver;
    String label;
    String selectPattern = "//label[text()='%s']/ancestor::lightning-picklist//";

    public Picklist(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        WebElement dropdownButton = driver.findElement(By.xpath(
                String.format(selectPattern + "button", label)));
        dropdownButton.click();

        WebElement optionElement = driver.findElement(By.xpath(String.format(selectPattern +
                        "lightning-base-combobox-item//span[text()='%s']",
                label, option)));
        ((JavascriptExecutor)driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                optionElement);
        optionElement.click();
    }
}
