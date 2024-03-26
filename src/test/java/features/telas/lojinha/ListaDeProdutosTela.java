package features.telas.lojinha;

import org.openqa.selenium.By;

import static features.tests.lojinha.produto.BaseTest.app;

public class ListaDeProdutosTela extends BaseTela{
    public AdicionarProdutoTela clicarNoBotaoDeAdicionarProduto(){
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new AdicionarProdutoTela();
    }
}
