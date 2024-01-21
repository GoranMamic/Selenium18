import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak8 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String validUsername= "gmamic8@gmail.com";
        String validPassword= "ITBootcampGoran";

        driver.navigate().to("https://wordpress.com/");
        WebElement login= driver.findElement(By.linkText("Log In"));
        login.click();

        WebElement usernameField= driver.findElement(By.id("usernameOrEmail"));
        usernameField.sendKeys(validUsername);

       WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
       submit.click();
       WebElement password= driver.findElement(By.id("password"));
       password.sendKeys(validPassword);

       submit.click();





    }
}
