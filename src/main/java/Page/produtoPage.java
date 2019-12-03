package Page;

import org.openqa.selenium.By;

public class produtoPage extends BasePage{
	
	public static void clicarComprar() {
		//clicar(By.id("br.com.kanui:id/buy_button"));
		clicarTexto("BUY");
	}
	
}
