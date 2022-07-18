package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSetUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // setup the path
		ChromeDriver driver = new ChromeDriver(); // Launch the browser
		driver.get("https://en-gb.facebook.com/"); // Load the URL
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait

		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();// Create new account
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anjana");// Enter first name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cholan");// Enter Last name
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("09999999");//Enter the mobile number
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Abcd@0987");//Enter the password
		
		//Handle all the three drop downs
	    driver.findElement(By.xpath("//div[@id='birthday_wrapper']"));
	    WebElement source1 =driver.findElement(By.xpath("//select[@id='day']"));//Select day
		Select date=new Select(source1);
		date.selectByVisibleText("31");
		
		WebElement source2 =driver.findElement(By.xpath("//select[@id='month']"));//Select month
		Select month=new Select(source2);
		month.selectByIndex(9);
		
		WebElement source3 =driver.findElement(By.xpath("//select[@id='year']"));//Select year
		Select year=new Select(source3);
		year.selectByValue("1993");
		
		driver.findElement(By.className("_58mt")).click();		
		
	}

}

