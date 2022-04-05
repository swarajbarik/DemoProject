package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;

public class DemoQAHomeStep {
    private BasePage basePage = new BasePage();
	
	@Given("user opens {string} in {string} browser")
	public void user_opens_in_browser(String url, String browser) {
	    basePage.initBrowser(browser);
	    basePage.openUrl(url);
	}

	@When("user click on dismiss message")
	public void user_click_on_dismiss_message() {
	    basePage.clickOnDismiss();
	}
	@Then("user verify the right corner should display the below links")
	public void verify_right_corner_should_display_the_below_links(DataTable dataTable) {
	    List<String> expected = dataTable.row(0);
	    basePage.validateTheMenu(expected);
	}
}
