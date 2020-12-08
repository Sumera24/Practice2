package eCommerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Webdriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com/index.php/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("MOBILE")).click();
		String a= driver.findElement(By.id("product-price-1")).getText();
		System.out.println("The Price for Sony Xperia is : " + a);
		
		//driver.findElement(By.linkText("SONY XPERIA")).click();
		
		//String b= driver.findElement(By.className("price")).getText();
		//System.out.println("The Price for Sony Xperia is : " + b);
		
		//assertEquals(a,b);
		//System.out.println(a.equals(b));
		driver.findElement(By.linkText("SAMSUNG GALAXY")).click();
		//String b= driver.findElement(By.id("product-price-3")).getText();
		
		//assertEquals(a,b);
		driver.findElement(By.id("qty")).sendKeys("4");

	}

}
