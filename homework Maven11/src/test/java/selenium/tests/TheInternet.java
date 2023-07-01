package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TheInternet {
    @Test
    public static void firstSeleniumHomework() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        driver.findElement(By.xpath("//a[@href='/drag_and_drop']")).click();
        driver.close();
    }
}
