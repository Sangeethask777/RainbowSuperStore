package executePageClasses;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {

  @DataProvider(name = "UnSuccessfullLoginDp")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "admin", "gtret" },
      new Object[] { "admin234", "admin" },
      new Object[] { "admin234", "admin00" },
      
      
      
      
    };
  }
  @DataProvider(name = "SuccessfullLoginDp")
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { "admin", "admin" },
      
      };
  
  
}
}
