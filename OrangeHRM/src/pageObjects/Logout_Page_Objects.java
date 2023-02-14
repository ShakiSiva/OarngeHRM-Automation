package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page_Objects {
	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
	public static WebElement userProfilePicDropdown;
	
	/*@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	public static WebElement logoutButton;
	*/
	@FindBy(linkText =  "Logout")
	public static WebElement logoutButton;

}
