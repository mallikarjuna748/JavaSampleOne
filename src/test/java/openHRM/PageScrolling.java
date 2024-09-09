package openHRM;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class PageScrolling {
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
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();
      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" John.Smith Admin John Smith Enabled  ")).getByRole(AriaRole.CELL, new Locator.GetByRoleOptions().setName("")).locator("i").click();
      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" Joe.Root ESS Joe Root Enabled  ")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" John.Smith Admin John Smith Enabled  ")).getByRole(AriaRole.CELL, new Locator.GetByRoleOptions().setName("")).locator("i").click();
      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" John.Smith Admin John Smith Enabled  ")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("profile picture")).click();
      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
    }
  }
}

