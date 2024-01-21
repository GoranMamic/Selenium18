import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));
        driver.get("https://www.joberty.com/");
        driver.switchTo().window(listaTabova.get(2));
        driver.get("https://mi-srbija.rs/");
        driver.switchTo().window(listaTabova.get(3));
        driver.get("https://store.steampowered.com/");
        driver.switchTo().window(listaTabova.get(4));
        driver.get("https://www.youtube.com/");
        driver.switchTo().window(listaTabova.get(5));
        driver.get("https://www.polovniautomobili.com/");

        driver.close();
        driver.switchTo().window(listaTabova.get(4));
        driver.close();
        driver.switchTo().window(listaTabova.get(3));
        driver.close();
        driver.switchTo().window(listaTabova.get(2));
        driver.close();
        driver.switchTo().window(listaTabova.get(1));
        driver.close();

    }
}
