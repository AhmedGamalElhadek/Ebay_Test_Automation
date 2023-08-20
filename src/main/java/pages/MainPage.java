
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;
    private final By searchBox = By.xpath("//*[@class=\"gh-tb ui-autocomplete-input\"]");
    private final By searchButton = By.id("gh-btn");
    private final By homeButton = By.xpath("//li[@class=\"hl-cat-nav__active\"]/span");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean confirmHomePageButton() {
        return this.driver.findElement(this.homeButton).isDisplayed();
    }

    public void enterSearchText(String text) {
        this.driver.findElement(this.searchBox).sendKeys(new CharSequence[]{text});
    }

    public SearchResultPage clickSearchButton() {
        this.driver.findElement(this.searchButton).click();
        return new SearchResultPage(this.driver);
    }
}
