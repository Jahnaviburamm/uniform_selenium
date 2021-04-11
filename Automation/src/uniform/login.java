package uniform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthik\\\\Desktop\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://uniformm1.upskills.in/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("input-email")).sendKeys("karthikmb963@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("jahnavib@7");
		

		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		
		
		
}
}