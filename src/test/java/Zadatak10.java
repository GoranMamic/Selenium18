import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://imgflip.com/memegenerator");
        WebElement uploadNewTemplate = driver.findElement(By.id("mm-show-upload"));
        uploadNewTemplate.click();
        WebElement uploadImage = driver.findElement(By.id("mm-upload-url"));
        uploadImage.sendKeys("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRihsz7K7Ts_XGyiPgw5Hyis3rcuAabjSSVqw&usqp=CAU");

        Thread.sleep(4000);
        WebElement uploadButton = driver.findElement(By.id("mm-upload-btn"));
        uploadButton.click();

        WebElement topTextbox= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[6]/div[1]/div[1]/textarea"));
        topTextbox.click();
        topTextbox.sendKeys("Kad Dejan kaže da će biti lakši domaći:");
        WebElement bottomTextbox= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[6]/div[2]/div[1]/textarea"));
        bottomTextbox.click();
        bottomTextbox.sendKeys();

    }
}
