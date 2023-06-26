package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	public void clickElement(WebElement element) 
	{
		element.click();
		
	}
	public void clearElement(WebElement element)
	{
		element.clear();
	}
	
	public void typeElement(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public String getTextOfElement(WebElement element)
	{
		return element.getText();
	
	}
	
	public String getCurrentUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
		
	}
	public boolean isDisplayedmethod(WebElement element)
	{
		return element.isDisplayed();
		
	}
	public void clickElementJs(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void scrollElementJs(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectByVisibleText(WebElement element, String value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void addThreadSleep() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public boolean isSelectedMethod(WebElement element)
	{
		return element.isSelected();
		
	}
	public boolean isenabledMethod(WebElement element)
	{
		return element.isEnabled();
		
	}
	public String getTitleMethod(WebDriver driver)
	{
		return driver.getTitle();
		
	}
	public void clickElement(WebElement element,String click)
	{
		element.sendKeys(click);
	}
	public void selectByValueMethod(WebElement element, String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void alertDismissMethod(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void alertGetTextMethod(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	public void alertSendKeys(WebDriver driver, String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	public void fileUploading(WebElement uploadFile, String value) {
		// TODO Auto-generated method stub
		
	}
	public void SubmitElement(WebElement saveButton) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
