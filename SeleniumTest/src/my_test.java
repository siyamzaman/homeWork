	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class my_test {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.id("idExample")).click();
		driver.findElement(By.className("main_title")).isDisplayed();
		driver.close();
		driver.quit();
			
	}
	@Test
	public void class_button() {
		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.className("buttonClassExample")).click();
		driver.findElement(By.className("main_title")).isDisplayed();
		driver.close();
		driver.quit();
	}
	@Test
	public void name_button() {
	System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.name("NameExample")).click();
		driver.findElement(By.className("main_title")).isDisplayed();
		driver.close();
		driver.quit();
	}
	}
