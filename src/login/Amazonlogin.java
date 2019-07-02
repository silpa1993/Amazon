package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Amazonlogin {
@Test
	public static void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/SILPA/workspace/Mytest/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		driver.findElement(By.name("email")).sendKeys("mssilpams93@gmail.com");
		//driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.name("password")).sendKeys("Password1993");
		driver.findElement(By.id("signInSubmit")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wall stickers");
		//driver.findElement(By.className("nav-input")).click();
		//driver.findElement(By.xpath("//div[@id='atfResults']/ul/li[1]/div/div[4]/div[1]/a")).click();
		//driver.findElement(By.name("submit.add-to-cart")).click();
		//driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
		
		//driver.findElement(By.name("submit.add-to-cart")).click();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		//driver.findElement(By.id("100_dealView_0"))..click()
		//driver.findElement(By.className("a-section a-spacing-none tallCellView gridColumn3 singleCell")).click();
		
		//driver.findElement(By.id("email")).sendKeys("mssilpams93@gmail.com");
		
	
		//driver.findElement(By.id("password")).sendKeys("Password1993");
		driver.quit();
	
	}
}



