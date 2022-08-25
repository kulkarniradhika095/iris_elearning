package com.iris_elearing_keywords;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.iris_elearing_util.PropUtil;
import com.iris_elearing_util.WaitFor;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator;

public class UserInterfaceKeywords {
	static PropUtil prop = new PropUtil();
	public static RemoteWebDriver driver;
	private static final Logger log = Logger.getLogger(UserInterfaceKeywords.class);

	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		log.info(browserName + " has been launched successfully..!");
	}

	public static void launchUrl(String url) {
		driver.get(url);
		log.info(url + " has been launched successfully..!");
	}

	public static void sendKeys(WebElement element, String key) {
		element.sendKeys(prop.getEnvDetails(key));
	}

	public static void mouseMove(WebElement element) {
		Actions act = new Actions(UserInterfaceKeywords.driver);
		act.moveToElement(element).perform();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void switchUrlFB(String urlFacebook) {
		driver.get(urlFacebook);
		log.info("Facebook page has been loaded successfully..!");
	}

	public static void switchUrlGoogle(String urlGoogle) {
		driver.get(urlGoogle);
		log.info("Google page has been loaded successfully..!");
	}

	public static void scroll(WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element);
		WaitFor.elementToBeClickable(element);
		element.click();
	}

	public static boolean display(WebElement element) {
		return element.isDisplayed();

	}

	public static void sendkey(WebElement element) {
		element.sendKeys();

	}

	public static void clickonlinks(WebElement element) throws InterruptedException {
		WebElement crsdd= driver.findElement(By.xpath("//div[@class='dropdown']"));
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size(); i++) {
			String a =Keys.chord(Keys.CONTROL,Keys.ENTER);
			crsdd.findElements(By.tagName("a")).get(i).sendKeys(a);
			Thread.sleep(5000L);
			Set<String> handle=driver.getWindowHandles();
			Iterator<String> it=handle.iterator();
			while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
				
		}
		
	}

}
