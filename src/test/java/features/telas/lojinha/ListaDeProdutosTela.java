package features.telas.lojinha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListaDeProdutosTela extends BaseTela{
    @FindBy(id = "com.lojinha:id/floatingActionButton")
    private WebElement botaoAdicionarProduto;
    public AdicionarProdutoTela clicarNoBotaoDeAdicionarProduto(){
        botaoAdicionarProduto.click();
        return new AdicionarProdutoTela();
    }
}
