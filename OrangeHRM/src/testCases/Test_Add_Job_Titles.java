package testCases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Job_Title_Page_Objects;

public class Test_Add_Job_Titles extends CommonFunctions{

	public void moveToJobTitlesPage() throws InterruptedException{
		Actions actions = new Actions(driver);
		actions.moveToElement(Job_Title_Page_Objects.JobLink);	
		actions.click().build().perform();	
		actions.moveToElement(Job_Title_Page_Objects.JobTitlesLink);	
		Thread.sleep(3000);
		actions.click().build().perform();
		actions.moveToElement(Job_Title_Page_Objects.AddButton);
		Thread.sleep(3000);
		actions.click().build().perform();	
	}

	@Test
	public void addJobTitles() throws InterruptedException{	
		PageFactory.initElements(driver, Job_Title_Page_Objects.class);	
		moveToJobTitlesPage();
		Job_Title_Page_Objects.JobTitle.sendKeys("QA");
		Job_Title_Page_Objects.JobDescription.sendKeys("Manual + Automation");
		Job_Title_Page_Objects.JobNotes.sendKeys("ISTQB added advantage");
		Job_Title_Page_Objects.SaveButton.click();	
	}
}
