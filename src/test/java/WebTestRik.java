import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestRik {
 private static WebDriver driver ;

    public static <webDriver> void main(String[] args) {

        System.out.println("katki");
        ChromeDriver auto = new ChromeDriver();
        auto.get("https://ariregister.rik.ee/");
        System.out.println("katki");
        System.out.println(auto.findElement(By.id("company_search")));
        auto.findElement(By.id("company_search")).click();
        auto.findElement(By.id("company_search")).sendKeys("14426582" +"\n" ) ;
    //auto.findElement(By.id("company_search")).sendKeys("14426582);

        auto.manage().window().maximize();









    }
}
