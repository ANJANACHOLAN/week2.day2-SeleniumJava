package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");// Enter username
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");// Enter password
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();// click login
		driver.findElement(By.xpath("//div[@id='button']")).click();// click crmsfa
		driver.findElement(By.xpath("//a[text()='Leads']")).click();// click leads
		driver.findElement(By.linkText("Find Leads")).click();// click find leads
		driver.findElement(By.xpath("//span[text()='Phone']/ancestor::li")).click();// click phone
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();//
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");// Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9489830016");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();// Click find leads button
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-col-partyId')]//a[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-col-partyId')]//a[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();//Click delete
		driver.findElement(By.linkText("Find Leads")).click();//click find leads
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);//search by id=13891
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//click find leads
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();//verify message
		System.out.println(text2);
		if (text2.contains("No records to display")) {
			
			System.out.println("Lead Sucessfuly deleted");
			
		}else {
			
			System.out.println("Lead is Not Deleted");
			
}
driver.close();
		
}

}
