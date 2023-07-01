package selenium.tests;

import io.netty.buffer.ByteBufUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.className;

public class MyFirstTests {

    @Test
    public void firstSeleniumTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement logo = driver.findElement(By.id("logotype-wrapper"));
        logo.click();

        WebElement siteMenu = driver.findElement(By.id("site-menu"));
        List<WebElement> links = driver.findElements(By.partialLinkText("https://the-internet.herokuapp.com/"));

    }
}
