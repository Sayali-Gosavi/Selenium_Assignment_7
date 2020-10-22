package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendkeys {
	
	WebDriver d;
	String url="https://www.gmail.com";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		d.quit();
	}

	@Test
	public void test() throws InterruptedException {
		// Initialize JS object
		JavascriptExecutor JSE = (JavascriptExecutor)d;
		// Enter username
		JSE.executeScript("document.getElementById('identifierId').value='sayaligosavi@gmail.com'");
		Thread.sleep(5000);
		
		
	}

}
