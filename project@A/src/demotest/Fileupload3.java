package demotest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload3 {

	public static void main(String[] args) throws IOException {
		
		// step1:To open and  set up google chrome driver
				System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
				//step2:Object creation for chrome driver and local variable declaration
				//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//step3: To maximize the window 
				driver.manage().window().maximize();
				//step4:Get the URL
				driver.get("https://monkeylearn.com/word-cloud");
				//to find element
				driver.findElement(By.className("Form-page-header-label")).click();				
				//Runtime.getRuntime().exec("\"C:\\Users\\USER\\OneDrive\\Documents\\autoResume1.exe\"");
			Runtime.getRuntime().exec("\"C:\\Users\\USER\\Downloads\\Tools\\Autoit-v3-setup\\autoResume.exe\"");	//"C:\Users\USER\Downloads\Tools\Autoit-v3-setup\autoResume.exe"
				//# scroll down syntax
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)", "");
		

	}
// covered thinks  are [file uploaded and scroll down]  successfully
}
