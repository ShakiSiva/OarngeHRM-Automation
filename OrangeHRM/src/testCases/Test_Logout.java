package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Logout_Page_Objects;

public class Test_Logout extends CommonFunctions{
	
	@Test
	public void logout() {
		PageFactory.initElements(driver, Logout_Page_Objects.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Logout_Page_Objects.userProfilePicDropdown);
		actions.click().build().perform();	
		actions.moveToElement(Logout_Page_Objects.logoutButton);
		actions.click().build().perform();	
		
		String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String expectedUrl= driver.getCurrentUrl();
		
		//Verification
		Assert.assertEquals(expectedUrl,actualUrl);

	}
	

}
