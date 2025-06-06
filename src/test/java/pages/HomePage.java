package pages;

public class HomePage extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String selectPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public HomePage(){
        super(driver);
    }

    //Method to navigate to the home page:
    public void navigateToHomePage(){
        navigateTo("https://www.freerangetesters.com");
        
    }

    //Method to click on the navigation bar link:
    public void clickOnSectionNavigationBar(String section){
        //Replace the placeholder in sectionLink with the name:
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickSelectPlanButton() {
        clickElement(selectPlanButton);
    }
}
