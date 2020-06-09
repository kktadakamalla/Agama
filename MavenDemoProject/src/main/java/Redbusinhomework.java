import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Redbusinhomework {

	
	@Test
	public void login() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tvnag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"src\"]"));
		driver.findElement(By.className("db")).sendKeys("Tambaram,Chennai");
		
		//Select From =new Select(driver.findElement(By.className("db")));
		//From.selectByVisibleText("Tambaram,Chennai");
}
}