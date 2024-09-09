package openHRM;

	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import java.util.*;

	public class Leave {
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
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Leave")).click();
	      page.locator(".oxd-date-input > .oxd-icon").first().click();
	      page.getByText("2", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("div:nth-child(2) > .oxd-input-group > div:nth-child(2) > .oxd-date-wrapper > .oxd-date-input > .oxd-icon").click();
	      page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("December")).locator("i").click();
	      page.getByText("September").click();
	      page.getByText("5", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator(".oxd-select-text--after > .oxd-icon").first().click();
	      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Rejected")).click();
	      page.locator(".oxd-select-wrapper > .oxd-select-text > .oxd-select-text--after > .oxd-icon").first().click();
	      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("CAN - Bereavement")).getByText("CAN - Bereavement").click();
	      page.getByPlaceholder("Type for hints...").click();
	      page.getByPlaceholder("Type for hints...").fill("a");
	      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Kumar N A")).first().click();
	      page.locator("div:nth-child(2) > .oxd-input-group > div:nth-child(2) > .oxd-select-wrapper > .oxd-select-text > .oxd-select-text--after > .oxd-icon").click();
	      page.getByText("Administration").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("profile picture")).click();
	      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
	    }
	  }
	}

	