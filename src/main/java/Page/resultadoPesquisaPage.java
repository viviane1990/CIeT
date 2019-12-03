package Page;

import org.openqa.selenium.By;

public class resultadoPesquisaPage extends BasePage {

	public static void clicarProduto() {
		clicar(By.id("br.com.kanui:id/image"));
	}
	
	public static void clicarCarrinho() {
		clicar(By.id("br.com.kanui:id/menu_cart"));
	}
	
	
}
