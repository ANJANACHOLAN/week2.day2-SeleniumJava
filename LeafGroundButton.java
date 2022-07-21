package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://leafground.com/pages/Button.html");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]/h5")).click();
Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
int xValue = location.getX();
System.out.println(xValue);
int yvalue = location.getY();
System.out.println(yvalue);
String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
System.out.println(cssValue);
Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
System.out.println(size);

	}

}