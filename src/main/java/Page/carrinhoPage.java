package Page;

import org.openqa.selenium.By;

public class carrinhoPage extends BasePage {

	public static void clicarFinalizarCompra() {
		clicar(By.id("br.com.kanui:id/cart_bottom_button"));
	}
	
	public static void clicarFinalizarPopup() {
		clicar(By.id("br.com.kanui:id/finalize_buttonn"));
	}
	
	public static void clicarExcluir() {
		clicar(By.id("br.com.kanui:id/item_remove_icon"));
	}
	
	public static void clicarQuantidade() {
		clicar(By.id("br.com.kanui:id/item_quantity_number"));
	}
	public static void clicarQnt2() {
		clicar(By.id("br.com.kanui:id/md_control"));
	}
	
	public static void validaQntProdutos() {
		obterTexto(By.id("br.com.kanui:id/custom_checkout_items"));
	}
}
