package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create a relationship between selenium & driver..
		System.setProperty("webdriver.chrome.driver",
				"E://Test Leaf Course/eclipse Workspace/LearnsSelenium/src/main/resources/ChromeDriver/chromedriver.exe");
		// Open the browser..
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter UserName
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		System.out.println(userName);
		// Enter Password..
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// Click on Leads Button
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		// Click on create Lead Button
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		// Enter all the fields in CreateLead page
		/**
		 * Note 1. Donot work on Parent Account Field 2.Enter the Birthdate using
		 * SendKeys
		 **/
		// Enter all the fields in contact information
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IIT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/11/1998");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		// Enter all the fields in primary address
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987878");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("222");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("kkk");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kkk@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.kkk.com");
		// click on create Lead Button
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("MS");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Dhoni");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("54/1 street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Charlotte");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Carolina");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Miami");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("000123");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");
		driver.findElement(By.name("submitButton")).click();
//		driver.close();

	}

}
