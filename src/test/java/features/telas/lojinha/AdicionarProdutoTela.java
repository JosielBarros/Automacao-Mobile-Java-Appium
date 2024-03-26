package features.telas.lojinha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdicionarProdutoTela extends BaseTela{
    @FindBy(id = "com.lojinha:id/productName")
    private WebElement elementoNomeProdutoPai;
    @FindBy(id = "com.lojinha:id/productValue")
    private WebElement elementoValorProdutoPai;
    @FindBy(id = "com.lojinha:id/button")
    private WebElement botaoSalvar;
    public AdicionarProdutoTela preencherDadosDoProduto(String nomeProduto, String valorProduto){
        elementoNomeProdutoPai.findElement(By.id("com.lojinha:id/editText")).sendKeys(nomeProduto);
        elementoValorProdutoPai.findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);
        return this;
    }
    public AdicionarProdutoTela clicarEmSalvar(){
        botaoSalvar.click();
        return this;
    }
}
