package com.mesaj.app.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjets.SignUpPageObject;

public class SignUpStepDef {
    @Given("^client wants to have accounts$")
    public void client_wants_to_have_accounts(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/test/resources/drivers/windows/chromedriver");

        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);
        signUpPageObject.go("http://demo.automationtesting.in/Register.html");
        signUpPageObject.WriteFirstNameTextbox ("Isolde");
        signUpPageObject.WriteLastnameTextbox ("Annibale");
        signUpPageObject.WriteEmailAdress("aaa@a.cl");
        signUpPageObject.Clickbtn2();
    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account(){

    }

    @Then("^he should be told that the account ws created$")
    public void he_should_be_told_that_the_account_ws_created(){

    }


}
