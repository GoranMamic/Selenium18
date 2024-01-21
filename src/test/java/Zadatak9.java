import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        Thread.sleep(10000);
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        WebElement addedToCartMessage = driver.findElement(By.cssSelector(".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold"));

        Assert.assertEquals("Added to Cart", addedToCartMessage.getText());

        WebElement proceedToCheckout= driver.findElement(By.id("sc-buy-box-ptc-button"));

        WebElement cart= driver.findElement(By.id("nav-cart-count-container"));

        Assert.assertTrue(cart.isDisplayed());

        Assert.assertTrue(proceedToCheckout.isDisplayed());
        cart.click();




    }
}
