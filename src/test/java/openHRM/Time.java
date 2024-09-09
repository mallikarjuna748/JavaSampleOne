package openHRM;

	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import java.util.*;

	public class Time {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      page.getByPlaceholder("Username").click();
	      page.getByPlaceholder("Username").fill("Admin");
	      page.getByPlaceholder("Password").click();
	      page.getByPlaceholder("Password").fill("admin123");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
	      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Test Testing sap 2023-01-16 - 2023-01-22 View")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("View")).click();
	      page.getByText("20", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("form i").nth(1).click();
	      page.getByText("17").first().click();
	      page.locator("form i").nth(1).click();
	      page.getByText("19").first().click();
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("profile picture")).click();
	      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
	    }
	  }
	}


