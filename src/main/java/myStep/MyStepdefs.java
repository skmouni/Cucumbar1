package myStep;

import com.sun.tools.javac.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyStepdefs {
    static WebDriver driver;
    @Given("open browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
         driver = new ChromeDriver();

        System.out.println("hi dear mouni");
    }

    @When("enter the url {string}")
    public void enterTheUrl(String url) {
        driver.get(url);

    }

    @And("click on my account menu")
    public void clickOnMyAccountMenu() {
        driver.findElement(By.xpath("//a[text()='My Account']")).click();

    }

    @And("enter registerd username and password")
    public void enterRegisterdUsernameAndPassword() {
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("siri");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sreddy@123");
        driver.findElement(By.xpath("//input[@name='login']")).click();

    }

    @And("click on login button")
    public void clickOnLoginButton() {

    }

    @Then("user must be suceesfully login to the webpage")
    public void userMustBeSuceesfullyLoginToTheWebpage() {
    }

    @And("enter registerd {string} and {string}")
    public void enterRegisterdAnd(String arg0, String arg1) {

    }

    @Then("the user verify field headers")
    public void theUserVerifyFieldHeaders(DataTable data) {
        List<String> lis = data.asList();
        List<WebElement> ele = driver.findElements(By.xpath("//form[@class='register']//label[contains(@for,'reg')]"));

        for(int i=0;i<lis.size();i++){
            for(int j=0;j<ele.size();j++){
                if(ele.get(j).getText().contains(lis.get(i))){
                    System.out.println(ele.get(j).getText());
                }
            }
        }
    }
}
