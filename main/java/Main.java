import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\einat\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
        driver.findElement(By.id("search_query_top")).submit();
        WebElement we = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));
        if (we  != null){
            System.out.println("test has pass");
        }else
        {
            System.out.println("test fail");
        }
    }
}
