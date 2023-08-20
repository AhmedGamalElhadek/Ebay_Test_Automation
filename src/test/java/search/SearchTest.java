
package search;

import base.BaseTest;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    public SearchTest() {
    }
    @Test
    public void landedOnMainPageTest(){
        String homePageMessage = this.readTestData("resources/testdata.json", "confirmHomePageMessage");
        Assert.assertTrue(this.mainPage.confirmHomePageButton(), homePageMessage);

    }
    @Test
    public void searchResultTest() {
        String searchText = this.readTestData("resources/testdata.json", "searchText");
        this.mainPage.enterSearchText(searchText);
        this.mainPage.clickSearchButton();
        String searchContain = this.readTestData("resources/testdata.json", "searchContain");
        String searchContainMessage = this.readTestData("resources/testdata.json", "searchContainErrorMessage");
        Assert.assertTrue(this.searchResultPage.validateResultsContainKeyword(searchContain), searchContainMessage);
        this.searchResultPage.radioButtonClick();
    }

    private String readTestData(String filePath, String key) {
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader(filePath);

            String var7;
            try {
                Object obj = jsonParser.parse(reader);
                JSONObject jsonData = (JSONObject)obj;
                var7 = (String)jsonData.get(key);
            } catch (Throwable var9) {
                try {
                    reader.close();
                } catch (Throwable var8) {
                    var9.addSuppressed(var8);
                }

                throw var9;
            }

            reader.close();
            return var7;
        } catch (ParseException | IOException var10) {
            var10.printStackTrace();
            return null;
        }
    }
}
