package assignment.week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) 
{
WebDriverManager.chromedriver().setup();//Launch the browser
ChromeDriver driver=new ChromeDriver();//Load the URL
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();//Maximize the window
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Add the wait
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");//Enter username
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");//Enter password
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();//click login
driver.findElement(By.xpath("//div[@id='button']")).click();//click crmsfa 
driver.findElement(By.xpath("//a[text()='Leads']")).click();//click leads
driver.findElement(By.linkText("Find Leads")).click();//click find leads
driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input[2]")).sendKeys("Anjana");//Enter firstname
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//click find leads
driver.findElement(By.linkText("10946")).click();//Click on first resulting lead
String title = driver.getTitle();//verify title of the page
System.out.println(title);
if(title.contains("View Lead"))
{ System.out.println("The title is correct");}
else {System.out.println("The title is wrong");}
driver.findElement(By.xpath("//a[text()='Edit']")).click();//click edit
driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Wipro");//change the company name
driver.findElement(By.xpath("//input[@name='submitButton']")).click();//click update
String a = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();// Confirm the changed name appears
System.out.println(a);
if(a.contains("Wipro"))
{System.out.println("The company name is correct");}
else
System.out.println("The company name is wrong");
driver.close();//Close the browser















	}

}


