package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class litecart {
    @Test
    public static void LitecartCategory(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        String expectedParentHeader = "Rubber Ducks";
        String expectedChildHeader = "Subcategory";
        driver.get("https://litecart.stqa.ru/en/");
        WebElement parentCategory = driver.findElement(By.xpath("//ul[@class='list-vertical']//li[@class='category-1']//a[contains(text(),'Rubber Ducks')]"));
        parentCategory.click();
        WebElement parentHeader = driver.findElement(By.cssSelector("h1[class='title']"));
        Assert.assertEquals( parentHeader.getText(), expectedParentHeader);
        WebElement childCategory = driver.findElement(By.xpath("//ul[@class='list-vertical']//a[contains(text(),'Subcategory')]"));
        childCategory.click();
        WebElement childHeader = driver.findElement(By.cssSelector("h1[class='title']"));
        Assert.assertEquals( childHeader.getText(), expectedChildHeader);
    }
}
