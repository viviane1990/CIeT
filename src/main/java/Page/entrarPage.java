package Page;

import org.openqa.selenium.By;

public class entrarPage extends BasePage {
	
	public static void inserirEmail(String email) {
		inserirTexto(By.id("br.com.kanui:id/form_login_email"), email);
		return;
	}
	
	public static void inserirSenha(String senha) {
		inserirTexto(By.id("br.com.kanui:id/form_login_password"), senha);
		return;
	}
	
	public static void clicarEntrar() {
		clicar(By.id("br.com.kanui:id/regist_login_user_button_enter"));
	}
	
	public static void clicarPromocao() {
		clicarTexto("On Sale");
	}
	
	public static void clicarLogout() {
		clicarTexto("Logout");
	}
}
