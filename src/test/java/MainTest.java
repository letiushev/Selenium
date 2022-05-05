import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest  {
    public WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TestSite() {
        // Static page test
        PageMain mainPage = new PageMain(this.driver);
        // Login
        PageLogin loginPage = mainPage.openLogin();
        PageDashboard dashboadrPage = loginPage.login("latokat942@pantabi.com", "Testsel47");
        System.out.println(dashboadrPage.getMainPageTitle());
        // Reading the page title
        Assert.assertTrue(dashboadrPage.getMainPageTitle().contains("MY ACCOUNT"));

        ButtonWishlist button1 = new ButtonWishlist(this.driver);
        System.out.println(button1.getButtonConfirm());
        // Reading textarea content
        Assert.assertTrue(button1.getButtonConfirm().contains("MY WISHLIST"));
        button1.press();
        
        // Form sending from user
        FormFillFromUser formFromUser = new FormFillFromUser(this.driver).fillFromUser("New wishlist");
        Assert.assertTrue(formFromUser.getFormConfirmFromUser().contains("Created"));
        System.out.println(formFromUser.getFormConfirmFromUser());

        // Send a form, fill input
        FormFillStaticPage fillForm = new FormFillStaticPage(this.driver).fill("Dress");
        System.out.println(fillForm.getFormConfirm());
        Assert.assertTrue(fillForm.getFormConfirm().contains("SEARCH"));

        PageMultiple pageMult = new PageMultiple(this.driver);
        pageMult.pressMultiple();

        // Logout
        ButtonLogout button2 = new ButtonLogout(this.driver);
        System.out.println(button2.getButtonConfirm());
        Assert.assertTrue(button2.getButtonConfirm().contains("Sign out"));
        button2.press();
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}