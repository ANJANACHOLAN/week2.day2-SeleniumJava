package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();// Setup the path
ChromeDriver driver = new ChromeDriver();// Launch the browser
driver.get("http://leafground.com/pages/Edit.html");// Load the URL
driver.manage().window().maximize();// Maximize the window
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anjucholan8@gmail.com");	//enter email address	
WebElement inputfield = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/input"));
inputfield.sendKeys("TEXT",Keys.TAB);		//append a text and press keyboard tab

String attribute = driver.findElement(By.name("username")).getAttribute("value");
System.out.println(attribute); //get default text entered

driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[4]/input")).clear(); //clear text

boolean displayed = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]/input")).isDisplayed();
System.out.println(displayed); //confirm that edit field is enabled
	
	}

}
