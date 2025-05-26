package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

    WebDriver driver;
    String label;

    public CheckBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void setChecked(boolean checked) {
        String checkboxXpath = String.format("//span[text()='%s']/ancestor::lightning-input//input[@type='checkbox']",
                label);
        WebElement checkbox = driver.findElement(By.xpath(checkboxXpath));
        if (checkbox.isSelected() != checked) {
            checkbox.click();
        }
    }
}
