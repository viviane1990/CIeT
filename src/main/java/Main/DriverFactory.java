package Main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

		private static AppiumDriver<MobileElement> driver;
		
		//Criar um driver caso nao houver nenhum, senão usa o que existe
		public static AppiumDriver<MobileElement> getDriver() { 
			if (driver == null) {
				criandoDriver();
			}
			return driver;
		}
		
		private static void criandoDriver() {
		
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Android_SDK_built_for_x86");
			caps.setCapability("udid", "emulator-5554"); 
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "7.0");
			caps.setCapability("appPackage", "br.com.kanui");
			caps.setCapability("appActivity", "br.com.kanui.appbuilder.deeplink.DeepLinkActivity");
			caps.setCapability("noReset", "true");
		
			try {
				driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			} catch (MalformedURLException e) {
				e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		}
		
		// Excluir ou matar o driver existente
		public static void killAppiumDriver () {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
			
			
		}
		
	}

