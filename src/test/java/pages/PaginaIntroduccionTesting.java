package pages;

public class PaginaIntroduccionTesting extends BasePage {

    private String compraAhoraButton = "//a[normalize-space()='Compra ahora' and @href]";


    public PaginaIntroduccionTesting(){
        super(driver);
    }

    public void clickCompraAhoraIntroduccionTestingButton() {
        clickElement(compraAhoraButton);
    }   
    

}