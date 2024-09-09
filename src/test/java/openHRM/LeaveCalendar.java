package openHRM;



	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import java.util.*;

	public class LeaveCalendar {
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
	      page.getByPlaceholder("Password").press("Tab");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).press("Enter");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Assign Leave")).click();
	      page.getByPlaceholder("Type for hints...").click();
	      page.getByPlaceholder("Type for hints...").fill("Ca");
	      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Charlie Carter")).click();
	      page.getByText("-- Select --").click();
	      page.getByText("US - Personal").click();
	      page.locator("form i").nth(2).click();
	      page.getByText("12").click();
	      page.locator("textarea").click();
	      page.locator("textarea").fill("Comment123!@#");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Assign")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ok")).click();
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("profile picture")).click();
	      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
	    }
	  }
	}