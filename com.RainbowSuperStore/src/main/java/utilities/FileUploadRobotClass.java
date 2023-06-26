package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotClass {

	public void fileUpload() throws AWTException {
		

		

		// creating object of Robot class
		Robot rb = new Robot();

		// Store the File path to the StringSelection class
		StringSelection filePath = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\Assignment9.docx");

		// Copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(2);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(5);
		rb.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("file uploaded..");

	}

}
