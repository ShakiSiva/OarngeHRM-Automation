package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Job_Title_Page_Objects {
	
	@FindBy(xpath = "//span[normalize-space()='Job']")
	public static WebElement JobLink;	
	@FindBy(xpath = "//a[normalize-space()='Job Titles']")
	public static WebElement JobTitlesLink;
	@FindBy(xpath = "//button[normalize-space()='Add']")
	public static WebElement AddButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	public static WebElement JobTitle;	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	public static WebElement JobDescription;	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
	public static WebElement JobNotes;	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement SaveButton;
	
	

}
