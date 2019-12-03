package Page;

import org.openqa.selenium.By;

public class promocaoPage extends BasePage {
	
	public static void  clicarPesquisar() {
		clicar(By.id("br.com.kanui:id/search_input"));
	}
	public static void inserirProduto(String produto) {
		inserirTexto(By.id("br.com.kanui:id/search_input"), produto);
		return;
	}
	public static void clicarEnterTeclado() {
		BasePage.tap(1008, 1700);
		
	}
	
}
