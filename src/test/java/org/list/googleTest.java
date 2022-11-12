package org.list;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleTest {
    public static WebDriver driver;
    @BeforeTest
    public void OpenBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void testSearch()
    {

        WebElement search=driver.findElement(By.tagName("input"));
       search.clear();
        search.sendKeys("Cats");
        search.submit();
    }
    @Test(priority = 2)
    public void testLogo()
    {

        WebElement photoTab= driver.findElement(By.linkText("صور"));
      photoTab.click();
        WebElement Glogo= driver.findElement(By.cssSelector("a.F1hUFe.jbTlie"));
        Assert.assertTrue(Glogo.isDisplayed());
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
