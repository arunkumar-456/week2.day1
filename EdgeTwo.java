package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTwo {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement eluname= driver.findElement(By.id("username"));
		eluname.sendKeys("Demosalesmanager");
		WebElement elpswrd= driver.findElement(By.id("password"));
		elpswrd.sendKeys("crmsfa");
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement distext= driver.findElement(By.tagName("h2"));
		String displayText= distext.getText();
		System.out.println(displayText);
		WebElement cmsa= driver.findElement(By.linkText("CRM/SFA"));
		cmsa.click();
		WebElement cleads= driver.findElement(By.linkText("Leads"));
		cleads.click();
		WebElement ccleads= driver.findElement(By.linkText("Create Lead"));
		ccleads.click();
		WebElement cname= driver.findElement(By.id("createLeadForm_companyName"));
		cname.sendKeys("Test");
		WebElement fname= driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("Arun");
		WebElement lname= driver.findElement(By.id("createLeadForm_lastName"));
		lname.sendKeys("kumar");
		WebElement flname= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		flname.sendKeys("Vinay");
		WebElement emailid= driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailid.sendKeys("arun.vinay@gmail.com");
		WebElement stateid= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sstateid = new Select(stateid);
		sstateid.selectByVisibleText("New York");
		WebElement createlogin= driver.findElement(By.className("smallSubmit"));
		createlogin.click();
		System.out.println("The title is "+ driver.getTitle());
		
		if (displayText.contains("welcome"))
		{
			System.out.println("Login successful");
		}
		else
		{ System.out.println("Login Failed"); }

		
	}

}
