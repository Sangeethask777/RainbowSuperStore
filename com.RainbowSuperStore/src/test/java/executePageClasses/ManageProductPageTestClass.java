package executePageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import PageClasses.ManageProductPageClass;
import utilities.GeneralUtilities;

public class ManageProductPageTestClass extends BaseClass {
	
	LoginPageClass lp;
	HomePageClass hp;
	ManageProductPageClass mpp;
	
	
	
  @Test
  public void verifyToSearchAProductInManageProductPage() 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mpp=new ManageProductPageClass(driver);
	  	  
	  lp.Login("admin", "admin");
	  hp.clickonManageProduct();
	  mpp.clickonSearchTab();
	  mpp.sendKeysToProductCode("1185");
	  mpp.submitOnSearchButton();
	  boolean actRes=mpp.isSearchResultDisplayed();
	  Assert.assertTrue(actRes);
	  
  }
  
   
  
}


