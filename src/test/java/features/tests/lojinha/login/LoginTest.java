package features.tests.lojinha.login;

import features.telas.lojinha.ListaDeProdutosTela;
import features.tests.lojinha.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static support.spec_helper.InitializeTela.telaLogin;
@DisplayName("Realizar Login")
public class LoginTest extends BaseTest {
    @Test
    @DisplayName("Validar autenticação do usuário")
    public void testValidarAutenticacaoDoUsuario(){
        boolean listaDeProdutosVisivel = submeterFormularioDeLogin("jhon", "123")
            .verificarTituloDaListaDeProduto();
        Assertions.assertTrue(listaDeProdutosVisivel);
    }
    @Test
    @DisplayName("Validar que não é possível autenticar-se com dados invalidos")
    public void testValidarQueNaoEPossivelAutenticarComDadosInvalidos(){
        String mensagemErro = submeterFormularioDeLogin("usuario_invalido", "senha_invalida")
            .capturarMensagem();
        Assertions.assertEquals("Erro de autenticação", mensagemErro);
    }
    @Test
    @DisplayName("Validar que não é possível autenticar-se com campo senha vazio")
    public void testValidarQueNaoEPossivelAutenticarComCampoSenhaVazio(){
        String mensagemErro = submeterFormularioDeLogin("jhon", "")
                .capturarMensagem();
        Assertions.assertEquals("Erro de autenticação", mensagemErro);
    }
    @Test
    @DisplayName("Validar que não é possível autenticar-se com campo usuario vazio")
    public void testValidarQueNaoEPossivelAutenticarComCampoUsuarioVazio(){
        String mensagemErro = submeterFormularioDeLogin("", "123")
                .capturarMensagem();
        Assertions.assertEquals("Erro de autenticação", mensagemErro);
    }
    public ListaDeProdutosTela submeterFormularioDeLogin(String usuario, String senha){
        return telaLogin()
            .preencherDadosDoUsuario(usuario, senha)
            .clicarEmEntrar();
    }
}
