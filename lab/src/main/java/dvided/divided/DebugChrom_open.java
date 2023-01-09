package dvided.divided;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


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
		}
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window();

		driver.get(new MeetAddress().MeetAddress());// 구글 미트 주소

		Thread.sleep(2000);
		
		try {
			driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[3]/div[2]/div/div[2]/button/span")).click();//알림창 끄기
		}catch(Exception e){
			
			driver.findElement(By.xpath(
					"//*[@id=\"yDmH0d\"]/c-wiz/div/div/div[13]/div[3]/div/div[1]/div[4]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button/span"))
			.click();
		}
		Thread.sleep(2000);}
	
	
}
