package testler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class test1 {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/C:/Users//Furka//Desktop//yazılım//Eğitimler//Çiçek_Sepeti_Bootcamp//chromedriver.exe/");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test1() {

        // Test name: Test1
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://www.ciceksepeti.com/");
        // 2 | setWindowSize | 945x1012 |
        driver.manage().window().maximize();
        // 3 | click | css=.user-menu-container:nth-child(3) .user-process-toggle > .user-menu__icon |
        driver.findElement(By.cssSelector(".user-menu-container:nth-child(3) .user-process-toggle > .user-menu__icon")).click();
        // 4 | click | linkText=Üye Girişi |
        driver.findElement(By.linkText("Üye Girişi")).click();
        // 5 | click | id=EmailLogin |
        driver.findElement(By.id("EmailLogin")).click();
        // 6 | type | id=EmailLogin | jefojo2176@jasmne.com
        driver.findElement(By.id("EmailLogin")).sendKeys("jefojo2176@jasmne.com");
        // 7 | click | id=Password |
        driver.findElement(By.id("Password")).click();
        // 8 | type | id=Password | 123456
        driver.findElement(By.id("Password")).sendKeys("123456");
        // 9 | click | css=.pull-right |
        driver.findElement(By.cssSelector(".pull-right")).click();
        // 10 | click | xpath=//input[@name=' '] |
        driver.findElement(By.xpath("//input[@name=\' \']")).click();
        // 11 | type | xpath=//input[@name=' '] | cüzdan
        driver.findElement(By.xpath("//input[@name=\' \']")).sendKeys("cüzdan");
        // 12 | click | linkText=TÜM SONUÇLARI GÖSTER |
        driver.findElement(By.linkText("TÜM SONUÇLARI GÖSTER")).click();
        // 13 | mouseOver | linkText=ELEKTRONİK |
        {
            WebElement element = driver.findElement(By.linkText("ELEKTRONİK"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 14 | mouseOut | linkText=ELEKTRONİK |
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        // 15 | click | css=.products__item:nth-child(1) .products__item-img |
        driver.findElement(By.cssSelector(".products__item:nth-child(1) .products__item-img")).click();
        // 16 | click | css=.product__action-button-text |
        driver.findElement(By.cssSelector(".product__action-button-text")).click();
        // 17 | click | id=dynamicText0 |
        driver.findElement(By.id("dynamicText0")).click();
        // 18 | type | id=dynamicText0 | abc
        driver.findElement(By.id("dynamicText0")).sendKeys("abc");
        // 19 | click | id=dynamicText1 |
        driver.findElement(By.id("dynamicText1")).click();
        // 20 | type | id=dynamicText1 | 123
        driver.findElement(By.id("dynamicText1")).sendKeys("123");
        // 21 | click | css=.js-customize-confirmation-label |
        driver.findElement(By.cssSelector(".js-customize-confirmation-label")).click();
        // 22 | click | css=.btn-wrapper:nth-child(1) > .btn |
        driver.findElement(By.cssSelector(".btn-wrapper:nth-child(1) > .btn")).click();
        // 23 | click | css=.total-price-area__right:nth-child(3) |
        driver.findElement(By.cssSelector(".total-price-area__right:nth-child(3)")).click();
        // 24 | assertText | css=.discount-text > .price-currency | TL
        assertThat(driver.findElement(By.cssSelector(".discount-text > .price-currency")).getText(), is("TL"));
    }
}
