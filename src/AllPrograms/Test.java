package AllPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
      driver.close();
	}

}

