package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Dashboard_Page_Objects;

public class Test_Leave_OnToday extends CommonFunctions{
	String actualMessage = null;

	public void getLeaveToday() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		actualMessage = Dashboard_Page_Objects.LeaveToday.getText();
	}

	@Test
	public void verifyLeaveOnToday() {	
		getLeaveToday();
		Assert.assertEquals(actualMessage, "No Employees are on Leave Today");
	}

}
