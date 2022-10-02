import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DemoClass {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/code4life/Downloads/chromedriver");

        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://code4life.us");
        WebElement enrollBtn  = driver.findElement(By.xpath("//ul[@id='menu-main-menu']//li[4]"));
        enrollBtn.click();
        WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
        fName.sendKeys("Test");
        WebElement lNmae = driver.findElement(By.xpath("//input[@name='lastname']"));

        lNmae.sendKeys("Testy");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));

        phone.sendKeys("5156668899");


        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));

        email.sendKeys("test.testy@gmail.com");


        WebElement value = driver.findElement(By.name("gender"));

        Select objSelect = new Select(value);
        objSelect.selectByVisibleText("Male");
        WebElement program = driver.findElement(By.name("class"));

        Select objSelect2 = new Select(program);
        objSelect2.selectByVisibleText("Software Development Engineer in Test (SDET)");

        WebElement state = driver.findElement(By.name("state"));

        Select select3 = new Select(state);
        select3.selectByVisibleText("New York");


        WebElement contact = driver.findElement(By.name("contacted"));

        Select select4 = new Select(contact);
        select4.selectByVisibleText("Phone Call");

        WebElement language = driver.findElement(By.name("language"));

        Select select5 = new Select(language);
        select5.selectByVisibleText("English");



        System.out.println(driver.getTitle());

        WebElement  webElement = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
        webElement.click();
        Thread.sleep(7000);
       // driver.quit();
    }
}
