package features.telas.lojinha;

import features.tests.lojinha.produto.AdicionarProdutoTest;
import org.openqa.selenium.By;

import static features.tests.lojinha.produto.BaseTest.app;

public class AdicionarProdutoTela extends BaseTela{
    public AdicionarProdutoTela preencherDadosDoProduto(String nomeProduto, String valorProduto){
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(nomeProduto);
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);
        return this;
    }
    public AdicionarProdutoTela clicarEmSalvar(){
        app.findElement(By.id("com.lojinha:id/button")).click();
        return this;
    }
}
