package openHRM;

import com.microsoft.playwright.Browser;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.regex.Pattern;

import org.xml.sax.Locator;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		assertThat(page).hasTitle(Pattern.compile("OrangeHRM"));
		page.getByPlaceholder("Username").click();
	    page.getByPlaceholder("Username").fill("Admin");
	    page.getByPlaceholder("Password").click();
	    page.getByPlaceholder("Password").fill("admin123");
	    assertThat(page).hasTitle(Pattern.compile("OrangeHRM"));
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	    page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("profile picture")).click();
	    page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
	    browser.close();
	    

	}


}
