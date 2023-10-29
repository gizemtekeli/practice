package gitPractice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GitPracticeForGroup {

	@Given("I navigated to Amazon Web Page")
	public void i_navigated_to_amazon_web_page() {
	    System.out.println("Step 1- Navigating to Page");
	}

	@When("I type something in the search box")
	public void i_type_something_in_the_search_box() {
		System.out.println("Step 2- Typing in to search box");
	}

	@When("I click on the search button in the page")
	public void i_click_on_the_search_button_in_the_page() {
		System.out.println("Step 3- Clicking on search button");
	}

	@Then("I can see the results of my search in the page")
	public void i_can_see_the_results_of_my_search_in_the_page() {
		System.out.println("Step 4- Viewing results in page ");
	}

	@Then("I can count the number of the results on the page")
	public void i_can_count_the_number_of_the_results_on_the_page() {
		System.out.println("Step 5- Counting total results in page");
	}

	
	
	
}
