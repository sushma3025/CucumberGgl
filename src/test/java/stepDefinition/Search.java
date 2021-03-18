package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectPOM.SearchPagePOM;

public class Search 
{
	SearchPagePOM searchpage = new SearchPagePOM();
	
	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable 
	{
		searchpage.launch();
	}
	

	@When("^User Login to Application$")
	public void user_Login_to_Application() throws Throwable 
	{    
			searchpage.search();
	}
	

	@Then("^Verify user Successfully Logged in$")
	public void verify_user_Successfully_Logged_in() throws Throwable 
	{ searchpage.verify();
	}
}


	
	
//	@Given("^User Launches the Application$")
//	public void user_Launch_the_Application() throws Throwable 
//	{
//		searchpage.launch();
//	}
//
//	@When("^User Search for something$")
//	public void user_Search_for_something() throws Throwable 
//	{
//	    
//		searchpage.search();
//	}
//	@Then("^Verify Successful search results$")
//	public void verify_Successful_search_results() throws Throwable 
//	{
//	    searchpage.verify();
//	}


