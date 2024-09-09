package openHRM;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
import java.util.regex.Pattern;

public class addEmp {
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
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("PIM")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add")).click();
      page.getByPlaceholder("First Name").click();
      page.getByPlaceholder("First Name").fill("Kumar");
      page.getByPlaceholder("First Name").press("Tab");
      page.getByPlaceholder("Middle Name").fill("N");
      page.getByPlaceholder("Middle Name").press("Tab");
      page.getByPlaceholder("Last Name").fill("A");
      page.getByPlaceholder("Last Name").press("Tab");
      page.locator("form span").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Create Login Details$"))).locator("span").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
    }
  }
}


