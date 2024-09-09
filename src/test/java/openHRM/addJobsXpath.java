package openHRM;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class addJobsXpath {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page.locator("//input[@name='username']").type("Admin");
		page.locator("//input[@name='password']").type("admin123");
		page.locator("//button[@type='submit']").click();
		page.locator("//span[text()='Admin']").click();
		page.locator("//span[text()='Job ']").click();
		page.locator("//a[text()='Job Titles']").click();
		page.locator("(//button[@type='button'])[3]").click();
		page.locator("(//input[@class='oxd-input oxd-input--active'])[2]").type("Automation");
		page.locator("//textarea[@placeholder='Type description here']").type("Automation Job descr");
		page.locator("//button[@type='submit']").click();
		page.locator("//span[text()='Job ']").click();
		page.locator("//a[text()='Job Titles']").click();
		page.locator("(//button[@type='button'])[3]").click();
		page.locator("(//input[@class='oxd-input oxd-input--active'])[2]").type("Automation1");
		page.locator("//textarea[@placeholder='Type description here']").type("Automation1 Job descr");
		page.locator("//button[@type='submit']").click();
		page.locator("//img[@class='oxd-userdropdown-img']").click();
		page.locator("//a[text()='Logout']").click();
		browser.close();		
		
		

	}


}
