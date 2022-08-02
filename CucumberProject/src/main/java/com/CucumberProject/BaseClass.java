package com.CucumberProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	// 1.Browser Launch

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
					+ "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\eclipse-Maven\\DemoTest\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;
	}

	// 2. Getting URL
	public static void getUrl(String url) {
		driver.get(url);

	}

	// 3. Send Keys
	public static void setValues(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	// 4. Click
	public static void clickOnElement(WebElement ele) {

		ele.click();
	}

	// 5. Clear
	public static void clearText(WebElement ele) {

		ele.clear();

	}

	// 6.Screenshot
	public static void TakeScreenshot(String value) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-Maven\\DemoTest\\Screenshot\\" + value);
		FileUtils.copyFile(src, dest);
		System.out.println("Screenshot Taken");
	}

	// 7. Close the current Webpage
	public static void closeTheWebPage() {
		driver.close();

	}

	// 8. Close the entire browser
	public static void closeTheBrowser() {
		driver.quit();

	}

	// 9. Navigate URL
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	// 10. Navigate to previous page
	public static void previousPage() {
		driver.navigate().back();
	}

	// 11. Navigate to next page
	public static void nextPage() {
		driver.navigate().forward();
	}

	// 12. Refresh the Page
	public static void refreshThePage() {
		driver.navigate().refresh();

	}

	// 13. Accept the alert
	public static void alertAccept(WebElement ele) {
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

	// 14. Dismiss the alert
	public static void alertDismiss(WebElement ele) {
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
	}

	// 15. Send message into alert box
	public static void alertSendMessage(WebElement ele, Object key) {
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys((String) key);
	}

	// 16. Getting message from the alert box
	public static void alertGetMessage(WebElement ele, Object key1) {
		Alert alert4 = driver.switchTo().alert();
		String text = alert4.getText();
		System.out.println(text);
	}

	// 17. Actions clicks
	public static void actionsClick(WebElement ele, String value) {
		Actions ac = new Actions(driver);
		if (value.equalsIgnoreCase("click")) {
			ac.click(ele).build().perform();
		} else if (value.equalsIgnoreCase("rightClick")) {
			ac.contextClick(ele).build().perform();
		} else if (value.equalsIgnoreCase("moveToElement")) {
			ac.moveToElement(ele).build().perform();
		} else if (value.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(ele).build().perform();

		}
	}

	// 18. Actions Drag and Drop
	public static void actionsDragandDrop(WebElement ele1, WebElement ele2) {
		Actions ac3 = new Actions(driver);
		ac3.dragAndDrop(ele1, ele2).build().perform();
	}

	// 19. Frame in
	public static void iFrame(int index) throws InterruptedException {
		driver.switchTo().frame(index);

	}

	// 20. Frame out
	public static void iFrameOut() {
		driver.switchTo().defaultContent();

	}

	// 21. Is Enable
	public static void isEnableCheck(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);

	}

	// 22.Is Selected
	public static void isSelectedCheck(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);

	}

	// 23. Get Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 24. Get Current Page URL
	public static void currentPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 25. Get Text
	public static void gettingText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);

	}

	// 26. Get Attributes
	public static void gettingAttribute(WebElement ele) {
		String attribute = ele.getAttribute("value");
		System.out.println("Attribute is - " + attribute);

	}

	// 27. Implicit Waits
	public static void implicitWaits(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((seconds)));

	}

	// 28. Explicit Waits
	public static void explicitWaits(Object seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds((Long) seconds));

	}

	// 29. Fluent Waits
	public static void fluentWaits(Object seconds, Object millis) {
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds((Long) seconds))
				.pollingEvery(Duration.ofMillis((Long) millis)).ignoring(NoSuchElementException.class);
	}

	// 30. Robot Up
	public static void robotUp(WebElement ele, String Value, int n) throws AWTException {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();
		if (Value == "up") {
			for (int i = 0; i <= n; i++) {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			}

			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	// 31. Robot Down
	public static void RobotDown(WebElement ele, String Value, int n) throws AWTException {
		if (Value == "down") {
			for (int i = 0; i <= n; i++) {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			Robot r2 = new Robot();
			r2.keyPress(KeyEvent.VK_ENTER);
			r2.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	// 32. Check Is Multiple
	public static void checkMultiple(WebElement ele) {
		Select s = new Select(ele);
		boolean multiple = s.isMultiple();
		System.out.println("Is this Multiple Dropdown ? - " + multiple);

	}

	// 33. Single Dropdown
	public static void singleDrop(WebElement element, Object all, Object input) {
		Select s = new Select(element);
		if (((String) all).equalsIgnoreCase("value")) {
			s.selectByValue((String) input);
		} else if (((String) all).equalsIgnoreCase("index")) {
			s.selectByIndex((Integer) input);
		} else if (((String) all).equalsIgnoreCase("text")) {
			s.selectByVisibleText((String) input);
		} else if (((String) all).equalsIgnoreCase("deselectvalue")) {
			s.deselectByValue((String) input);

		} else if (((String) all).equalsIgnoreCase("deselectindex")) {
			s.deselectByIndex((Integer) input);
		} else if (((String) all).equalsIgnoreCase("deselecttext")) {
			s.deselectByVisibleText((String) input);
		} else {
			System.out.println("Wrong input");
		}

	}

	// 34. Multiple Dropdown
	public static void multiDrop(WebElement element, String opt) {
		Select s1 = new Select(element);
		if (opt.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = s1.getOptions();
			for (WebElement all : options) {
				System.out.println(all.getText());

			}

		} else if (opt.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
			for (WebElement all : allSelectedOptions) {
				System.out.println(all.getText());
			}
		} else if (opt.equalsIgnoreCase("getfirstselected")) {
			WebElement first = s1.getFirstSelectedOption();
			System.out.println(first.getText());
		}

		else if (opt.equalsIgnoreCase("deselectall")) {
			s1.deselectAll();
		}

	}

	// 35. Scroll to element
	public static void scrollPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// 36. JavaScrip click
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// 37. Window Handle
	public static void windowHandles(WebElement ele) {
		String childid = driver.getWindowHandle();
		ele.click();
		Set<String> parentid = driver.getWindowHandles();
		String y = null;
		for (String id : parentid) {
			if (id.equals(childid)) {
				y = id;
			}
			driver.switchTo().window(y);
		}
	}

}
