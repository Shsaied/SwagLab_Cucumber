package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_Login;

import static Steps.Hooks.driver;

public class SD01_Login {
    String userName="standard_user";
    String password="secret_sauce";
    @Given("User Enter Valid Username and Password")
    public void filluserNameandPassword(){
        new P01_Login(driver).insertUserName(this.userName).insertPassword(this.password);
    }
    @When("User Click Login Button")
    public void clickLogin(){
        new P01_Login(driver).clickLoginButton();
    }
    @Then("User shall navigate to home page")
    public void checkLogin(){
        System.out.println("hello");
    }

}
