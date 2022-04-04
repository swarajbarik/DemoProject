package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;

public class ShopProgramsStep {
	BasePage basePage = new BasePage();
	
	@Given("user opens {string} in {string} browser")
	public void user_opens_in_browser(String url, String browser) {
		basePage.initBrowser(browser);
		basePage.openUrl(url);
	}

	@When("user click on {string} menu")
	public void user_click_on_menu(String menu) {
	}

	@Then("user can see the Quick Links section displayed")
	public void user_can_see_the_quick_links_section_displayed() {
	}


}
