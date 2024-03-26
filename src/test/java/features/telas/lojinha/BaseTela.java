package features.telas.lojinha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

import static features.tests.lojinha.BaseTest.app;
import static support.commands.Commands.elementVisible;

public class BaseTela {
    @FindBy(xpath = "//android.widget.Toast")
    private WebElement mensagemToast;
    public BaseTela(){
        PageFactory.initElements(app, this);
    }
    public String capturarMensagem(){
        return mensagemToast.getText();
    }
    public boolean elementoEstaVisivel(WebElement elemento) {
        return elementVisible(elemento);
    }
}
