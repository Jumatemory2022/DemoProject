import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestFunction {

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/code4life/Downloads/chromedriver");

        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement enrollBtn  =  driver.findElement(By.name("q"));
        enrollBtn.sendKeys("Java book for beginner");
        enrollBtn.sendKeys(Keys.ENTER);

        Thread.sleep(7000);
        driver.quit();

    }
}
