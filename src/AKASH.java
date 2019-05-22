import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AKASH {
	static WebDriver driver;
	static WebElement element;
	public static void main(String[] args) {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver,10);
			
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
