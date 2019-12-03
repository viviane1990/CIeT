package Step;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;

import Page.BasePage;
import Page.carrinhoPage;
import Page.checkoutPage;
import Page.entrarPage;
import Page.homePage;
import Page.produtoPage;
import Page.promocaoPage;
import Page.resultadoPesquisaPage;
import Test.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clienteSteps {
	
		@Given ("efetuei login no sistema")
		public void efetuarLogin() {
			homePage.ClicarMinhaConta();
			homePage.ClicarLogin();
			BaseTest.enviarUsuario();
	    	BaseTest.enviarSenha();
		}	
		@And ("na tela Promocao pesquiso produto")
		 public void pesquisarProduto() {
	    	entrarPage.clicarPromocao();
	    	promocaoPage.clicarPesquisar();
	    	BaseTest.esperarElemento(100);
	    	BaseTest.enviarProduto();
	    	BaseTest.esperarElemento(100);
	    	promocaoPage.clicarEnterTeclado();
	    }
	    @And ("na tela de resultados da pesquisa, seleciono produto") 
	    public void selecionarProduto() {
	    	BaseTest.esperarElemento(100);
	    	resultadoPesquisaPage.clicarProduto();
	    }  
	    @When ("adiciono no carrinho") 
	    public void adicionarAoCarrinho() {
	    	produtoPage.clicarComprar();
	    	resultadoPesquisaPage.clicarCarrinho();
	    	carrinhoPage.clicarFinalizarCompra();
	    	carrinhoPage.clicarFinalizarPopup();
	    	
	    }	
	    @And ("informo de pagamento no cartao de credito")
	    public void selecionarFormaPagamento() {
	    	BaseTest.scroll();
	    	checkoutPage.verificarCartaoCredito("true");
	    	BaseTest.enviarDadosCartao();
	    }
	    @Then ("sera exibida o valor total da compra")
	    public void validarTotalCompra() {
	    	Assert.assertEquals(("br.com.kanui:id/total_price"), checkoutPage.validarTotalCompra());
	    	BaseTest.deslogarAPP();
	    }
}
