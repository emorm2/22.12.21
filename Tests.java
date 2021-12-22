import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\einat\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        //shooping example:
       /* driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
        driver.findElement(By.id("search_query_top")).submit();
        WebElement we = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));
        if (we  != null){
            System.out.println("test has pass");
        }else
        {
            System.out.println("test fail");
        }*/

        // calculator:
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.findElement(By.id("number1Field")).sendKeys("4");
        driver.findElement(By.id("number2Field")).sendKeys("4");
        driver.findElement(By.id("calculateButton")).click();
        String resulr =  driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        if (resulr.equals("8")){
            System.out.println("test pass");
        }
        else {
            System.out.println("test fail");
        }

    }
}
