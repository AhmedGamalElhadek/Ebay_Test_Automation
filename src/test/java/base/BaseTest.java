package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;
import pages.SearchResultPage;

public class BaseTest {
    private WebDriver driver;
    protected MainPage mainPage;
    protected SearchResultPage searchResultPage;

    public BaseTest() {
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.driver.get("https://www.ebay.com/");
        this.mainPage = new MainPage(this.driver);
        this.searchResultPage = new SearchResultPage(this.driver);
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
