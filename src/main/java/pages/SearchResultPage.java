
package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    private final WebDriver driver;
    private final By searchResult = By.cssSelector(".s-item__info.clearfix");
    private final By radioButton = By.cssSelector("input[aria-label='Manual']");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean validateResultsContainKeyword(String keyword) {
        List<WebElement> resultItems = this.driver.findElements(this.searchResult);
        System.out.println("The list size = "+(resultItems.size()-1));
        for(int i = 1; i < resultItems.size(); ++i) {
            WebElement resultItem = (WebElement)resultItems.get(i);
            String resultText = resultItem.getText();
            if (resultText.toLowerCase().contains(keyword.toLowerCase())) {
                return true;

            }

        }

        return false;
    }

    public void radioButtonClick() {
        this.driver.findElement(this.radioButton).click();
    }
}
