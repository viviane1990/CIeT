package Page;

import org.openqa.selenium.By;

public class resultadoPesquisaPage extends BasePage {

	public static void clicarProduto() {
		BasePage.tap(760, 1360);
	}
	
	public static void clicarCarrinho() {
		clicar(By.id("br.com.kanui:id/menu_cart"));
	}
}
