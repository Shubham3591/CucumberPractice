package org.openCart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    // Locators
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement myAccountLogin;

    @FindBy(name = "email")
    public WebElement userNameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-section\"]/h1")
    public WebElement loginText;

    @FindBy(linkText = "Logout")
    public WebElement logoutLinkLocator;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void doLogin(String username, String password) {
            //myAccount.click();
            //myAccountLogin.click();
            userNameField.sendKeys(username);
            passwordField.sendKeys(password);
        }

        public void clickOnLoginButton(){
            loginButton.click();
        }

    public boolean checkLogoutLink(){
        return (logoutLinkLocator).isDisplayed();
    }
    }
