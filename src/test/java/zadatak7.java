import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak7 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practicetestautomation.com/");

        WebElement practice= driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLogin= driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a"));
        testLogin.click();

        WebElement username1= driver.findElement(By.id("username"));
        username1.sendKeys("Goran");

        WebElement password1= driver.findElement(By.id("password"));
        password1.sendKeys("zasto opet moram da trazim element koji vec postoji? :(");

        WebElement submit1 = driver.findElement(By.id("submit"));
        submit1.click();

        WebElement username2= driver.findElement(By.id("username"));
        username2.sendKeys("student");

        WebElement password2= driver.findElement(By.id("password"));
        password2.sendKeys("pogresan");

        WebElement submit2 = driver.findElement(By.id("submit"));
        submit2.click();

        WebElement username3= driver.findElement(By.id("username"));
        username3.sendKeys("studet");

        WebElement password3= driver.findElement(By.id("password"));
        password3.sendKeys("password123");

        WebElement submit3 = driver.findElement(By.id("submit"));
        submit3.click();

    }
}
