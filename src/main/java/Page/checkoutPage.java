package Page;

import org.junit.Assert;
import org.openqa.selenium.By;

public class checkoutPage extends BasePage{

	public static checkoutPage verificarCartaoCredito(Object check) {
		Assert.assertTrue(check.equals("true"));
		return null;
	}
	
	public static checkoutPage inserirNumeroCartao(String numeroCartao) {
		inserirTexto(By.id("br.com.kanui:id/credit_card_number"), numeroCartao);
		return null;
	}
	
	public static checkoutPage inserirNomeCartao(String nomeCartao) {
		inserirTexto(By.id("br.com.kanui:id/credit_card_holder_namer"), nomeCartao);
		return null;
	}
	
	public static checkoutPage inserirValidadeCartao(String validadeCartao) {
		inserirTexto(By.id("br.com.kanui:id/credit_card_expiration_date"), validadeCartao);
		return null;
	}
	
	public static checkoutPage inserirSegurancaCartao(String segurancaCartao) {
		inserirTexto(By.id("br.com.kanui:id/credit_card_security_code"), segurancaCartao);
		return null;
	}
	
	public static checkoutPage validarTotalCompra() {
		obterTexto(By.id("br.com.kanui:id/total_price"));
		return null;
	}
	
	public static checkoutPage validarProduto() {
		obterTexto(By.id("br.com.kanui:id/product_name"));
		return null;		
	}
	
	public static checkoutPage validarQuantidade() {
		obterTexto(By.id("br.com.kanui:id/product_quantity"));
		return null;
		
	}
}
