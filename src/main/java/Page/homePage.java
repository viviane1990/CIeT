package Page;

import org.openqa.selenium.By;

public class homePage extends BasePage {
	
	public static homePage ClicarMinhaConta() {
		clicarTexto("My Account");
		return null;
	}
	
	public static homePage ClicarLogin() {
		clicarTexto("Login");
		return null;
	}
	
	public homePage validarTextoDeslogado() {
		obterTexto(By.id("br.com.kanui:id/search_input"));
		return null;
	}
}
