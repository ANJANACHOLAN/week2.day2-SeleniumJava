package assignment.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Setup the path
		ChromeDriver driver = new ChromeDriver();// Launch the browser
		driver.get("http://www.leafground.com/pages/Dropdown.html");// Load the URL
		driver.manage().window().maximize();// Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Add the wait
		
		WebElement training = driver.findElement(By.xpath("//div[@class='example']/select"));//select by index
		Select drop=new Select(training);
		drop.selectByIndex(2);
		
		WebElement training1 = driver.findElement(By.xpath("(//div[@class='example'])[2]/select"));
		Select drop1=new Select(training1);
		drop1.selectByVisibleText("Selenium");
		
		WebElement training2 = driver.findElement(By.xpath("(//div[@class='example'])[3]/select"));
		Select drop2=new Select(training2);
		drop2.selectByValue("3");
		
		Select S=new Select(driver.findElement(By.xpath("(//div[@class='example'])[4]/select")));
		List<WebElement> L = S.getOptions();
		System.out.println(L.size());
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Selenium");
		
	Select Sel = new Select(driver.findElement(By.xpath("//div[@class='example'])[6]/select")));

				if(Sel.isMultiple()){
					
					//Selecting multiple values by index
					Sel.selectByIndex(1);
					Sel.selectByIndex(2);

					//selecting by values
					Sel.selectByValue("Loadrunner");
				
				}
		

	}

}
