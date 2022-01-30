package week2.day1;


import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumProgram {

	 public static void main(String[] args) {
		 //to create a relationship between selenium & driver..
		 System.setProperty("webdriver.chrome.driver","E://Test Leaf Course/eclipse Workspace/LearnsSelenium/src/main/resources/ChromeDriver/chromedriver.exe");
		//it is to open chrome browser
		 ChromeDriver driver=new ChromeDriver(); 
		 //To load an url to the browser we use...
		 driver.get("//http://leaftaps.com/opentaps/control/main");
		 //To maximize the browser.. 
		 driver.manage().window().maximize();
		 //To close the browser..
		 driver.close();
		 
		 }
	
}
