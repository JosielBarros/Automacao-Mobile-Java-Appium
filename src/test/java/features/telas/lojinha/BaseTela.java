package features.telas.lojinha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static features.tests.lojinha.produto.BaseTest.app;

public class BaseTela {
    @FindBy(xpath = "//android.widget.Toast")
    private WebElement mensagemToast;
    public BaseTela(){
        PageFactory.initElements(app, this);
    }
    public String capturarMensagem(){
        return mensagemToast.getText();
    }
}
