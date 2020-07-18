package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.intellipaat.actitime.page.DashboardPage;
import com.intellipaat.actitime.page.LoginPage;
import com.intellipaat.actitime.util.Helper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver = null;
	LoginPage lp = null;
	DashboardPage dp = null;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
		driver.get("http://localhost/login.do");

	}

	@Given("^enters valid username$")
	public void enters_valid_username() throws Throwable {
		lp.enterUserName("admin");
	}

	@Given("^enters valid password$")
	public void enters_valid_password() throws Throwable {
		lp.enterPassword("manager");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		lp.clickonLogin();
	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed() throws Throwable {
		dp.validateDashboardPage();
	}

	@Then("^user can logout from the applicaiont$")
	public void user_can_logout_from_the_applicaiont() throws Throwable {
		dp.logout();
	}

	
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I want to write a step with aruh(\\d+)$")
	public void i_want_to_write_a_step_with_aruh(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I want to write a step with ahb(\\d+)$")
	public void i_want_to_write_a_step_with_ahb(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
