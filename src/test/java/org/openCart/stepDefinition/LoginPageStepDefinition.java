package org.openCart.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openCart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageStepDefinition {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Given("I am on the OpenCart login page")
    public void i_am_on_the_open_cart_login_page()  {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage = PageFactory.initElements(driver, LoginPage.class);;
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() throws InterruptedException {
        Thread.sleep(3000);

        loginPage.doLogin("sahu.shubham3591@gmail.com","Test@123");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.checkLogoutLink(), true);
    }
}
