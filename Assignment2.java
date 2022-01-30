package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create a relationship between selenium & driver..
		System.setProperty("webdriver.chrome.driver",
				"E://Test Leaf Course/eclipse Workspace/LearnsSelenium/src/main/resources/ChromeDriver/chromedriver.exe");
		// Open the browser..
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
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
//		 Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
//		Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
//		Click Email Tab
		driver.findElement(By.linkText("Email")).click();
//		Type email as ..
		WebElement emailId = driver.findElement(By.id("ext-gen160"));
		emailId.sendKeys("babu@testleaf.com");
//		Click Find Contacts
		WebElement findContacts = driver.findElement(By.id("ext-gen212"));
		findContacts.click();
//		 Close the browser;
		driver.close();

	}

}
