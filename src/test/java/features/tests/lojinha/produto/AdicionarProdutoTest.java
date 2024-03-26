package features.tests.lojinha.produto;

import features.tests.lojinha.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static support.spec_helper.InitializeTela.telaLogin;

@DisplayName("Adicionar produtos ao usuário")
public class AdicionarProdutoTest extends BaseTest {
    @Test
    @DisplayName("Validar cadastro de produto para o usuário")
    public void testValidarCadastroDeProdutoParaOUsuario() {
        String mensagemSucesso = submeterCadastroDeProduto("450000");
        Assertions.assertEquals("Produto adicionado com sucesso", mensagemSucesso);
    }
    @Test
    @DisplayName("Validar que não é possível cadastrar produto com valor igual a 0,00")
    public void testValidarQueNaoEPossivelCadastrarProdutoComValorIgualAAzero(){
        String mensagemErro = submeterCadastroDeProduto("000");
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemErro);
    }
    @Test
    @DisplayName("Validar que não é possível cadastrar produto com valor maior que 7000,00")
    public void testValidarQueNaoEPossivelCadastrarProdutoComValorMaiorQueSeteMil(){
        String mensagemErro = submeterCadastroDeProduto("700001");
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemErro);
    }
    public String submeterCadastroDeProduto(String valorProduto){
        return telaLogin().preencherDadosDoUsuario("jhon", "123")
            .clicarEmEntrar()
            .clicarNoBotaoDeAdicionarProduto()
            .preencherDadosDoProduto("Iphone 15", valorProduto)
            .clicarEmSalvar()
            .capturarMensagem();
    }
}
