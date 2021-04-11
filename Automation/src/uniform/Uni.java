package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthik\\\\Desktop\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://uniformm1.upskills.in/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jahnavib");
		driver.findElement(By.id("input-lastname")).sendKeys("Musalaboyina");
		driver.findElement(By.id("input-email")).sendKeys("karthikmb963@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9182255137");
		driver.findElement(By.id("input-address-1")).sendKeys("D.NO21/167A,Upparipeta,Nandyal");
		driver.findElement(By.id("input-city")).sendKeys("Nandyal");
		driver.findElement(By.id("input-postcode")).sendKeys("518501");
		driver.findElement(By.id("input-country")).sendKeys("India");
		driver.findElement(By.id("input-zone")).sendKeys("AndhraPradesh");
		driver.findElement(By.id("input-password")).sendKeys("jahnavib@7");
		driver.findElement(By.id("input-confirm")).sendKeys("jahnavib@7");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/fieldset[4]/div[1]/div[1]/label[2]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")).click();
		
	}

}

