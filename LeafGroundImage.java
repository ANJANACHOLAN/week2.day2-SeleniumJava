package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://leafground.com/pages/Image.html");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();//go to home page
		driver.navigate().back();
		boolean displayed = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/img")).isDisplayed();
		System.out.println(displayed);
        driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/img"));
				

	}

}
