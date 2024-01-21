import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wordpress.com/");

        Cookie cookie= new Cookie("wordpress_logged_in", "gmamic8%7C1800042588%7C8ecaCEMkRsH0gjXxOhUhuW4E1ELb4b2KTavdL2VogqO%7C19e4223afab761a61b6fbc6d1a13f1ce04e0243280c324dcf87739e0f2ffe36e");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        Thread.sleep(4000);

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        Thread.sleep(4000);

        driver.quit();


    }
}
