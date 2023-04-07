package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editlead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sophia");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("muthiah");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sophia");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("testing");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("testing using selenium");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sophiaprakash06@gmail.com");
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd = new Select(element);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("selenium");
		driver.findElement(By.name("submitButton")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(5000);
		 driver.close();		 
		
	}

}
