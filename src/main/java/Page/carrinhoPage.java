package Page;

import org.openqa.selenium.By;

public class carrinhoPage extends BasePage {

	public static void clicarFinalizarCompra() {
		clicar(By.id("br.com.kanui:id/cart_bottom_button"));
	}
	
	public static void clicarFinalizar() {
		clicar(By.id("br.com.kanui:id/finalize_button"));
	}
	
}
