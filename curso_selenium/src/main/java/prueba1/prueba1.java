package prueba1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba1 {
	public static void main(String[] args) {
		//String exePath = "./driver/chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
