import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testTracalorie {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.expandtesting.com/tracalorie/?classId=e83a1e60-d212-4fa4-9e1c-f89284b2328a&assignmentId=bf2480e2-ae85-49e3-bbb4-6fc77a9d30d8&submissionId=6b8658d2-ae21-ac36-3834-978c3d5d79eb");

    }
//    @AfterEach
//    void teardown(){
//        driver.quit();
//    }

//    @Test
//    public void testAddMeal(){
//        driver.findElement(By.id("item-name")).sendKeys("meal1");
//        driver.findElement(By.id("item-calories")).sendKeys("100");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        driver.findElement(By.id("item-name")).sendKeys("meal2");
//        driver.findElement(By.id("item-calories")).sendKeys("150");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        assertEquals("meal1: 100 Calories", driver.findElement(By.id("item-0")).getText(), "Text should mach");
//        assertEquals("meal2: 150 Calories", driver.findElement(By.id("item-1")).getText(), "Text should mach");
//    }
//    @Test
//    public void testListSize(){
//        driver.findElement(By.id("item-name")).sendKeys("meal1");
//        driver.findElement(By.id("item-calories")).sendKeys("100");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        List<WebElement> firstList = driver.findElements(By.cssSelector("ul#item-list > li"));
//        int firstListSize = firstList.size();
//        driver.findElement(By.id("item-name")).sendKeys("meal2");
//        driver.findElement(By.id("item-calories")).sendKeys("150");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        List<WebElement> secondList = driver.findElements(By.cssSelector("ul#item-list > li"));
//        int secondListSize = secondList.size();
//        assertTrue(secondListSize == firstListSize + 1);
//    }
//    @Test
//    public void testCalorieSum(){
//        driver.findElement(By.id("item-name")).sendKeys("meal1");
//        driver.findElement(By.id("item-calories")).sendKeys("100");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        driver.findElement(By.id("item-name")).sendKeys("meal2");
//        driver.findElement(By.id("item-calories")).sendKeys("150");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        assertEquals("250", driver.findElement(By.cssSelector(".total-calories")).getText(), "Total calories should be 250");
//    }
//    @Test
//    public void testUpdate() {
//        driver.findElement(By.id("item-name")).sendKeys("meal1");
//        driver.findElement(By.id("item-calories")).sendKeys("100");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        driver.findElement(By.cssSelector("#item-0 > a > i")).click();
//        driver.findElement(By.id("item-calories")).clear();
//        driver.findElement(By.id("item-calories")).sendKeys("150");
//        driver.findElement(By.cssSelector("button.update-btn.btn")).click();
//        assertEquals("meal1: 150 Calories", driver.findElement(By.id("item-0")).getText(), "Text should be 'meal1: 150 Calories'");
//    }
//    @Test
//    public void testDelete(){
//        driver.findElement(By.id("item-name")).sendKeys("meal1");
//        driver.findElement(By.id("item-calories")).sendKeys("100");
//        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
//        driver.findElement(By.cssSelector("#item-0 > a > i")).click();
//        driver.findElement(By.cssSelector("button.delete-btn.btn")).click();
//    }
    @Test
    public void testClearAll(){
        driver.findElement(By.id("item-name")).sendKeys("meal1");
        driver.findElement(By.id("item-calories")).sendKeys("100");
        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
        driver.findElement(By.id("item-name")).sendKeys("meal2");
        driver.findElement(By.id("item-calories")).sendKeys("150");
        driver.findElement(By.cssSelector("button.add-btn.btn")).click();
        driver.findElement(By.cssSelector("body > nav > div > div > ul > li > a")).click();
//        assertTrue(driver.findElement(By.id("item-0")).isEmpty());


    }
}
