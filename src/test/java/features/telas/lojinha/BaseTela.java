package features.telas.lojinha;

import org.openqa.selenium.By;
import static features.tests.lojinha.produto.BaseTest.app;

public class BaseTela {
    public String capturarMensagem(){
        return app.findElement(By.xpath("//android.widget.Toast")).getText();
    }
}
