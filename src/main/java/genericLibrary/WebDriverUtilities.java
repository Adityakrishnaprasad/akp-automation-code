package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	
	public void dropDown(WebElement ele,String text)
	{
	  Select s = new Select(ele);
	  s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele);
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick().perform();
    }
	
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragdrop(WebDriver driver,WebElement src,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	
}
	
