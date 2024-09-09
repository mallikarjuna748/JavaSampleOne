package openHRM;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class MyInfo {
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
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Info")).click();
      page.locator("form").filter(new Locator.FilterOptions().setHasText("Blood Type-- Select -- Save")).locator("i").click();
      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("A-")).click();
      page.locator("form").filter(new Locator.FilterOptions().setHasText("Blood TypeA- Save")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
      page.locator("form").filter(new Locator.FilterOptions().setHasText("Employee Full NameNicknameEmployee IdOther IdDriver's License NumberLicense Expi")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
      page.getByText("Employee Full NameNicknameEmployee IdOther IdDriver's License NumberLicense Expi").click();
      page.locator("form").filter(new Locator.FilterOptions().setHasText("Employee Full NameNicknameEmployee IdOther IdDriver's License NumberLicense Expi")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contact Details")).click();
      page.locator("div:nth-child(9) > .oxd-grid-3 > div:nth-child(2) > .oxd-input-group > div:nth-child(2) > .oxd-input").click();
      page.locator("div:nth-child(9) > .oxd-grid-3 > div:nth-child(2) > .oxd-input-group > div:nth-child(2) > .oxd-input").fill("admin@gmail.com");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.getByRole(AriaRole.BANNER).getByRole(AriaRole.IMG, new Locator.GetByRoleOptions().setName("profile picture")).click();
      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
    }
  }
}
