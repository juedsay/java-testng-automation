package steps;

import io.cucumber.java.en.*;
import pages.HomePage;

public class FreeRageSteps {
    
    HomePage landingPage = new HomePage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToHomePage();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }


}
