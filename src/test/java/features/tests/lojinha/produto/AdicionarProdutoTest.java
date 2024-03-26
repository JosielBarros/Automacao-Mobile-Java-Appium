package features.tests.lojinha.produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static support.spec_helper.InitializeTela.telaLogin;

public class AdicionarProdutoTest extends BaseTest{

    @Test
    @DisplayName("Validar cadastro de produto para o usuário")
    public void testValidarCadastroDeProdutoParaOUsuario() {
        String mensagemSucesso = telaLogin().preencherDadosDoUsuario("jhon", "123")
                .clicarEmEntrar()
                .clicarNoBotaoDeAdicionarProduto()
                .preencherDadosDoProduto("Iphone 15", "650000")
                .clicarEmSalvar()
                .capturarMensagem();
        Assertions.assertEquals("Produto adicionado com sucesso", mensagemSucesso);
    }
}
