package assignment.week2.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://leafground.com/pages/Link.html");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		driver.findElement(By.linkText("Go to Home Page")).click();//Go to home page
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]/h5")).click();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);//where it goes without clicking
		
	    driver.findElement(By.linkText("Verify am I broken?")).click();//verify if the page is broken
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.navigate().back();
	    
	    String attribute2 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");//verify if the link is same
	    System.out.println(attribute2);
	    String attribute3 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
	    System.out.println(attribute3);
	    if(attribute2.equals(attribute3))
	    System.out.println("Both are same");
	    else
	    System.out.println("Both are different");      
	    
	    List<WebElement> findElement = driver.findElements(By.tagName("a"));//how many links available in the page
	    int size = findElement.size();
	    System.out.println(size);	
		
	}

}
