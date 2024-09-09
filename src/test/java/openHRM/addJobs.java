package openHRM;

		import com.microsoft.playwright.*;
		import com.microsoft.playwright.options.*;
		import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
		import java.util.*;

		public class addJobs {
		  public static void main(String[] args) {
		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		      page.getByPlaceholder("Username").click();
		      page.getByPlaceholder("Username").fill("Admin");
		      page.getByPlaceholder("Username").press("Tab");
		      page.getByPlaceholder("Password").fill("admin123");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();
		      page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Job")).locator("i").click();
		      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Job Titles")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add")).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(1).click();
		      page.getByRole(AriaRole.TEXTBOX).nth(1).fill("Automation1");
		      page.getByPlaceholder("Type description here").click();
		      page.getByPlaceholder("Type description here").fill("Job descr");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
		      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" Account Assistant  ")).getByRole(AriaRole.CELL, new Locator.GetByRoleOptions().setName("")).locator("i").click();
		      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" Account Assistant  ")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Yes, Delete")).click();
		      page.getByRole(AriaRole.BANNER).getByRole(AriaRole.IMG, new Locator.GetByRoleOptions().setName("profile picture")).click();
		      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
		    }
		    }
		  }
		
	

