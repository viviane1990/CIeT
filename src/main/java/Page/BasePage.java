package Page;

import static Main.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	public static void  clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public static void  clicarTexto(String texto) {
		clicar(By.xpath("//*[@text='"+texto+"']"));
	} 
	
	public static void inserirTexto(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public static String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public static void obterRadioButton() {
		MobileElement check = getDriver().findElement(By.id("br.com.kanui:id/payment_method_radio_button"));
	}
	
	public static void tap(int x, int y) {
		new TouchAction(getDriver())
		.press(PointOption.point(x, y))
		.release()
		.perform(); 
	}	
	
}
