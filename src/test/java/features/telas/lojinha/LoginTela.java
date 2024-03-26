package features.telas.lojinha;

import org.openqa.selenium.By;

import static features.tests.lojinha.produto.BaseTest.app;

public class LoginTela extends BaseTela{
    public LoginTela preencherDadosDoUsuario(String usuario, String senha){
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    }
    public ListaDeProdutosTela clicarEmEntrar(){
        app.findElement(By.id("com.lojinha:id/button")).click();
        return new ListaDeProdutosTela();
    }
}
