package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
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
//		 Click Create Contact 
		driver.findElement(By.linkText("Create Contact")).click();
//		 Type First Name
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Krish");
//		 Type Last Name
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Srivatsav");
//		 Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
//		 Print the first name and browser title 
		System.out.println(firstName);
		System.out.println("Page title is : " + driver.getTitle());
//		 Close the browser;
		driver.close();

	}

}
