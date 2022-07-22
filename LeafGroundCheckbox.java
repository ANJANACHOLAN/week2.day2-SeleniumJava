package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://leafground.com/pages/checkbox.html");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.xpath("//div[@class='example']/input[1]")).click();
		
		boolean selected = driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected();
		System.out.println(selected);
		
		driver.findElement(By.xpath("(//div[@class='example'])[3]/input[2]")).click();
	
		

	}

}
