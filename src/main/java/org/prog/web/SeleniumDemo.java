package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumDemo {
    //private final static String COOKIES_LINK = "//a[contains(@href,'technologies/cookies')]";

    public static void main(String[] args) {
        WebDriver driver = null;
        String searchProduct = "iphone 16";
        try {
            driver = new ChromeDriver();
            driver.get("https://allo.ua/");

            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.click();
            searchInput.sendKeys(searchProduct);
            searchInput.sendKeys(Keys.ENTER);

            List<WebElement> description = new WebDriverWait(driver, Duration.ofSeconds(5)).
                    until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("product-card__content"), 1));

            if(description.size()>1) {
                System.out.println(description.get(0).findElement(By.tagName("a")).getText());
            } else {
                System.out.println("The searched products are not available on the site");
            }


        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
