package mavtestngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavTestng1 {
  @Test
  public void f() {

	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mgang\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		  
  
  }
}


