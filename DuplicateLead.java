package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // setup the path driver
		ChromeDriver driver = new ChromeDriver(); // Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");// Load the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); // enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// enter the password
		driver.findElement(By.className("decorativeSubmit")).click(); // click the login button
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();// Click CRM/SFA
		driver.findElement(By.linkText("Leads")).click(); // click Leads
		driver.findElement(By.linkText("Create Lead")).click();// click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");// Enter the company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjana");// Enter the first name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cholan");// Enter the lastname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anju");// Enter the local name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");// enter deprtmnt name
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Details");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anjucholan8@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(state);
		drop.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ANJANA");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());	

	}

}
