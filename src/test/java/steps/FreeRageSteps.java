package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaRegistro;

public class FreeRageSteps {
    
    HomePage landingPage = new HomePage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionPage = new PaginaIntroduccionTesting();
    PaginaRegistro registroPage = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToHomePage();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When ("I select Elegir Plan")
    public void selectPlan(){
        landingPage.clickSelectPlanButton();
    }

    @And("Select Introducción al Testing de Software")
    public void navigateToIntro()  {
        cursosPage.clickIntroduccionTestingLink();
        introduccionPage.clickCompraAhoraIntroduccionTestingButton();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans(){
        List<String> lista = registroPage.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes " + (char)8226 + " 15 productos", 
                "Academia: $176 / a\u00F1o " + (char)8226 + " 15 productos", "Free: Gratis " + (char)8226 + " 3 productos"); //Letra ñ minuscula con codigo unicode: \u00F1o ; Símbolo • con código decimal: (char)8226 con código unicode: \u2022

        Assert.assertEquals(listaEsperada, lista);
    }
}
