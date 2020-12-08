package eCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Verify item in Mobile List page can be sorted by 'Name' */
		
		System.setProperty("webdriver.gecko.driver","C:\\Webdriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com/index.php/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("MOBILE")).click();
		System.out.println(driver.getTitle());
	
		new Select(driver.findElement(By.tagName("select"))).selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");
		System.out.println("All Mobile Products Sorted By Name");

	}

}
