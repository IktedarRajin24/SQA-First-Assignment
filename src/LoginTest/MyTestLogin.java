package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/Project_ADBMS/login-view.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("rushdi@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.id("pass")).sendKeys("1234");
        Thread.sleep(5000);
        driver.findElement(By.id("login-btn")).click();
        Thread.sleep(5000);
        String at = driver.getTitle();
        String et = "dashboard";
        System.out.println(at);
        driver.close();
        
        if(at.equalsIgnoreCase(et))
        {
            System.out.println("Test successful");
        }
        else
        {
            System.out.println("Test Failure");
        }
	}
}


