package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.User_Role_Page_Objects;

public class Test_User_Role extends CommonFunctions{	

	public void moveToUserPage() {
		Actions actions = new Actions(driver);
		actions.moveToElement(User_Role_Page_Objects.adminLink);
		actions.click().build().perform();	
		actions.moveToElement(User_Role_Page_Objects.userManagementLink);	
		actions.click().build().perform();	
		actions.moveToElement(User_Role_Page_Objects.usersLink);	
		actions.click().build().perform();			 
	}

	public void selectUserRole() {	
		Actions actions = new Actions(driver);
		actions.moveToElement(User_Role_Page_Objects.userRole);
		actions.click().build().perform();	
		actions.moveToElement(User_Role_Page_Objects.userRoleValue);
		actions.click().build().perform();		
	}

	public void selectUserStatus() {
		Actions actions = new Actions(driver);
		actions.moveToElement(User_Role_Page_Objects.userStatus);
		actions.click().build().perform();	
		actions.moveToElement(User_Role_Page_Objects.userStatusValue);
		actions.click().build().perform();	
	}

	@Test
	private void checkUserRole() {
		PageFactory.initElements(driver, User_Role_Page_Objects.class);	
		moveToUserPage();
		selectUserRole();
		selectUserStatus();	
		User_Role_Page_Objects.searchButton.click();

		Assert.assertEquals("Enabled", driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']")).getText());
		Assert.assertEquals("Admin", driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']")).getText());

	}

}
