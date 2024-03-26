package features.telas.lojinha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTela extends BaseTela{

    @FindBy(id = "com.lojinha:id/button")
    private WebElement botaoEntrar;
    @FindBy(id = "com.lojinha:id/user")
    private WebElement elementoUsuarioPai;
    @FindBy(id = "com.lojinha:id/password")
    private WebElement elementoSenhaPai;
    public LoginTela preencherDadosDoUsuario(String usuario, String senha){
        elementoUsuarioPai.findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);
        elementoSenhaPai.findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    }
    public ListaDeProdutosTela clicarEmEntrar(){
        botaoEntrar.click();
        return new ListaDeProdutosTela();
    }
}
