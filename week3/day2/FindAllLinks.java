package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 //Launch the browser
		 ChromeDriver driver=new ChromeDriver(); 
		 //Load the URL
		 driver.get("https://www.amazon.in/");
		 //Maximize the browser
		 driver.manage().window().maximize();
		 WebElement click =driver.findElement(By.xpath("//form[@id='nav-search-bar-form']//input[@id='twotabsearchtextbox']"));
         click.sendKeys("Phones");
         click.sendKeys(Keys.ENTER);
		 List<WebElement> allMobileprice = driver.findElements(By.className("a-price-whole"));
		  List<Integer>priceList= new ArrayList<Integer>();  
		 for (WebElement allprice : allMobileprice) { 
			String text = allprice.getText().replaceAll("\\D","");
			System.out.println(text);
			int price=Integer.parseInt(text);
			priceList.add(price);
		 }
		 Collections.sort(priceList);
		 System.out.println("Least Price:" +priceList.get(0));
		 
		
		 
			
		}
		
			
		}
	
