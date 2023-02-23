package week3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AijoOnlineShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		List<WebElement> bag = driver.findElements(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		 
for(WebElement web:bag)
{
	String text = web.getText();
	System.out.println("the count of  "+text);
}
	List<WebElement> brand1 = driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("bag Brand NAME");
	for(WebElement brad:brand1)
	{
		String text = brad.getText();
		System.out.println(text);
	}
	List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println("List of bag name");
	for(WebElement bagname1:bagname)
	{
		
		String text = bagname1.getText();
	System.out.println(text);
	}
	}
}


