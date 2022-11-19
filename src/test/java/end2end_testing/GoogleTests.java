package end2end_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTests {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleLogo() {
        driver.get("https://www.google.com/");
        boolean actResult = driver.findElement(By.cssSelector("img.lnXdpd")).isDisplayed();
        Assert.assertTrue(actResult);
    }

    @Test
    public void testSearchResults() {
        driver.findElement(By.name("q")).sendKeys("ITI Pluralsight Scholarship", Keys.ENTER);
        String text = driver.findElement(By.cssSelector("div#result-stats")).getText();
        System.out.println(text);
        Assert.assertNotEquals(text, "");
    }
    
        @Test
    public void testLogoInImages(){
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.clear();
        textBox.sendKeys("ITI Pluralsight Scholarship", Keys.ENTER);
        driver.findElement(By.cssSelector(".rQEFy span")).click();
        boolean actResult = driver.findElement(By.cssSelector(".F1hUFe svg")).isDisplayed();
        Assert.assertEquals(actResult, true);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
