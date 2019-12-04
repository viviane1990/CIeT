package Test;

import static Main.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.Dimension;

import Main.DriverFactory;
import Page.checkoutPage;
import Page.entrarPage;
import Page.homePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseTest {

	protected static homePage homePage = new homePage();
	protected entrarPage entrarPage = new entrarPage();
	
	@After
	public void fecharAppium() {
		DriverFactory.killAppiumDriver();
	} 
	
	public static void enviarUsuario() {
		esperarElemento(100);
		Page.entrarPage.inserirEmail("viviane.test.auto@gmail.com");	
	}
	public static void enviarSenha() {
		Page.entrarPage.inserirSenha("teste2019");
		Page.entrarPage.clicarEntrar();
	}
	
	public static void enviarProduto() {
		Page.promocaoPage.inserirProduto("meias");
		esperarElemento(100);
	}
	
	public static void enviarOutroProduto() {
		Page.promocaoPage.inserirProduto("oculos");
		esperarElemento(100);
	}
	
	
	public static void enviarDadosCartao() {
		checkoutPage.inserirNumeroCartao("5294043154782274");
		checkoutPage.inserirNomeCartao("Teste Auto");
		checkoutPage.inserirValidadeCartao("0321");
		checkoutPage.inserirSegurancaCartao("578");
	}
	
	public static void deslogarAPP() {
		Page.homePage.ClicarMinhaConta();
		scroll();
		Page.entrarPage.clicarLogout();
		esperarElemento(3000);
		assertEquals("What are you looking for?", homePage.validarTextoDeslogado());
	}
	
	public static void esperarElemento(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void scroll() {
		Dimension size = getDriver().manage().window().getSize();
 		int x = size.width /2;
		int y_incial = (int) (size.getHeight()* 0.8);
		int y_final = (int) (size.getHeight() * 0.20);
		
		
   		new TouchAction(getDriver())
	    	.press(PointOption.point(x, y_incial))
	    	.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	    	.moveTo(PointOption.point(x, y_final))
	    	.release()
	    	.perform(); 	
	}
	
	
}
