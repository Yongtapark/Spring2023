package dvided.divided;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;


public class DebugChrom_open {

	List<Object> data = new ArrayList<Object>();
	List<Object> nameData = new ArrayList<Object>();
	List<Object> camData = new ArrayList<Object>();
	List<Object> noCamData = new ArrayList<Object>();
	List<Object> resultList;
	List<Object> onlineList = new ArrayList<Object>();
	List<Object> resultCamon = null;
	List<Object> resultCamoff = null;
	List<Object> resultOffline = null;
	List<WebElement> camOn;
	Student studentList = new Student();
	WebElement person = null;

	public void open() throws IOException, InterruptedException {
		
		Path path = Paths.get(System.getProperty("user.dir"), "sec/main/resouce/chromdriver.exe");

		System.setProperty("webdriver.chrom.driver", path.toString());



		try {
			Runtime.getRuntime().exec(
					"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");

		} catch (Exception e) {
			Runtime.getRuntime().exec(
					"C:/Program Files/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");
		}}
}
