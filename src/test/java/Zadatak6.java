import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practicetestautomation.com/");

        WebElement practice= driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLogin= driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a"));
        testLogin.click();

        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submit= driver.findElement(By.id("submit"));
        submit.click();

        WebElement loginSuccesful= driver.findElement(By.className("post-title"));
        String expectedText= loginSuccesful.getText();

        Assert.assertEquals("Logged In Successfully",expectedText );

        WebElement logout = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a"));

        Assert.assertTrue(logout.isDisplayed());

        logout.click();




    }
}
