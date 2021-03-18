package pageObjectPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SearchPagePOM 
{
	public WebDriver driver;
	public By search = By.name("q");
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	public void search()
	{
		driver.findElement(search).sendKeys("Selenium");
		driver.findElement(search).sendKeys(Keys.ENTER);
		
	}
	
	public void verify()
	{
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
	    //String expected = "https://www.google.com/search?source=hp&ei=ZslOYNr_D9a0tQacq6-IAg&iflsig=AINFCbYAAAAAYE7XdgbDEWFxmZX7FUaI2ZIOl5DpN9KS&q=selenium&oq=selenium&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAELEDMgUIABCxAzIFCAAQsQMyBQgAELEDMgUIABCxAzIFCAAQsQMyAggAMgUIABCxAzIFCAAQsQMyBQgAELEDOggIABCxAxCDAToLCC4QsQMQxwEQowI6BAgAEAM6AgguOg4ILhCxAxDHARCjAhCTAjoOCC4QsQMQgwEQxwEQowI6BQguELEDOggILhCxAxCDAToICC4QxwEQowI6CAguELEDEJMCUMUFWMkOYLARaABwAHgAgAHtAYgBsweSAQU1LjIuMZgBAKABAaoBB2d3cy13aXo&sclient=gws-wiz&ved=0ahUKEwjayvKEo7HvAhVWWs0KHZzVCyEQ4dUDCAk&uact=5";
	    //Assert.assertTrue(actual.contains("https://www.google.com/search?source="));
	}
	
}
