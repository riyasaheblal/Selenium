package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumCode {
	@Test
	public void t1_01_validate_login_zero_app() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8088/");
		driver.manage().window().maximize();

		// Click on "Add Contact"
		driver.findElement(By.linkText("Add Contact")).click();

		// Wait for a moment (Replace this with explicit waits in a real scenario)
		Thread.sleep(5000);

		// Fill in data for BRAND NAME and WATER TYPE
		WebElement brandNameField = driver.findElement(By.cssSelector("input[placeholder='Enter your brand name']"));
		brandNameField.sendKeys("Mettle");

		WebElement waterTypeField = driver.findElement(By.cssSelector("input[placeholder='Enter your water type']"));
		waterTypeField.sendKeys("cold & warm");

		// Click on submit
		WebElement submitButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		submitButton.click();
		// update that 
		driver.findElement(By.linkText("update")).click();
		WebElement brandNameField1 = driver.findElement(By.cssSelector("input[placeholder='Enter your brand name']"));
		brandNameField1.sendKeys("Duke");

		WebElement waterTypeField1 = driver.findElement(By.cssSelector("input[placeholder='Enter your water type']"));
		waterTypeField1.sendKeys("Chilled");

		// Click on submit
		WebElement submitButton1 = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		submitButton1.click();

		// delete data from the table
		driver.findElement(By.linkText("delete")).click();

		Thread.sleep(5000);

		//Close the browser
		//driver.quit();
	}
}
