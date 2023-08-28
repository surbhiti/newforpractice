package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);	
		
	}
	
	
	//declaration
	
	@FindBy (id="container_tt")
	private WebElement timetrack;
	
	@FindBy(id="container_tasks")
	private WebElement task;
	
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy(id="container_users")
	private WebElement users;

	//getter methods
	public WebElement getTimetrack() {
		return timetrack;
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsers() {
	
		return users;
	}
	
	//business logic
	
	public void homePageapp()
	
	{
		//timetrack.click();
		//task.click();
		//reports.click();
		users.click();
		
		
	}

}
