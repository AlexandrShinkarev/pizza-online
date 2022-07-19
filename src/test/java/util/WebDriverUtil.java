package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverUtil {
    private WebDriver driver;

    public WebDriverUtil() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close() {
        driver.close();
    }

    public WebElement findElement(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public WebElement findElementWithWait(String locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void clickButton(String locator) {
        WebElement button = findElement(locator);
        if (button == null) {
            System.out.println("Element not found");
        } else {
            button.click();
        }
    }

    public void clickButtonWithWait(String locator) {
        WebElement button = findElementWithWait(locator);
        if (button == null) {
            System.out.println("Element not found");
        } else {
            button.click();
        }
    }

    public String getText(String locator) {
        WebElement textElement = findElement(locator);
        if (textElement == null) {
            System.out.println("Element not found");
            return "";
        } else {
            return textElement.getText();
        }
    }




}
