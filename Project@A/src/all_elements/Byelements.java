package all_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byelements {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1: Setup for Open GoogleChrome Browser/Driver
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		//object  creation for web driver or  Chrome driver in local declaration 
		//if we use testNG or methods  we have to declaration in Global
		ChromeDriver driver=new ChromeDriver();
		//Step2:Maximize Browser
		driver.manage().window().maximize();
		//Step3:Enter Valid URL
		driver.get("https://demo.automationtesting.in/Register.html");
		//Step4:Find the element and give send keys  by locater 
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Hanumanthu");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Ramesh");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
        driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("21-9/5-10 pasuputhota madhuranagar");
		 //driver.findElement(By.tagName("textarea")).sendKeys("21-9/5-10 pasuputhota madhuranagar");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("hanumanthuramesh01@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9963834574");
        //driver.findElement(By.xpath("//div[@id=\"msdd\"] ")).click();
       JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,400)", "");
        Select skill= new Select( driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
        skill.selectByVisibleText("Analytics");
        
       
		Thread.sleep(4000);
	   //driver.close();
		//driver.quit();
		
	  
		
	   //To completely close use quit ();and just minimize use close();
		    //driver.close();	
	}

}
// covered thinks are Tag name ,By.id,By.name,by x-path and Droupdown selector as well




