package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageClasses.LoginPageClass;

public class LoginPageTestClass extends BaseClass {
	
	LoginPageClass lp;
	
	
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "SuccessfullLoginDp")
  public void verifySuccessfulLogin(String usrname,String pswd ) 
  {
	lp=new LoginPageClass(driver);
	lp.Login("admin", "admin");
	String actual=lp.getTextofMessageDisplayed();
	String expected="Admin";
	Assert.assertEquals(actual, expected);
		
  }
  
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "UnSuccessfullLoginDp")
  public void verifyUnSuccessfulLogin(String uname, String password) 
  {
	  lp=new LoginPageClass(driver);
	  lp.Login("uname", "password");
	  boolean actual=lp.isErrorMessageDisplayed();
	  Assert.assertTrue(actual);
  }
  
  @Test
  public void verifyRememberMeCheckBoxIsSelectedByDefaultOrNot() 
  {
	  lp=new LoginPageClass(driver);
	  boolean actualResult=lp.isRememberMeCheckBoxSelected();
	  Assert.assertFalse(actualResult);
  }
  
  
  
  
}

