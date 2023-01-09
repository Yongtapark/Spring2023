package dvided.divided;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class googlecheck_Simple_Origin {

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
	int size;

	public void check() throws IOException {

		WebElement person = null;
		String cam;
		String online = null;
		String teacher = new Teacher().teacher();
		String teacherPresent = new Teacher().teacher_pre(); // 강사님 이름을 적으세요(프레젠테이션)은 지우지 말아주세요. ex)ㅇㅇㅇ강사님(프레젠테이션)
		String[] student = studentList.nameList();// 학생 이름을 기입해 주세요
		List<String> studentALL = Arrays.asList(student);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DebugChrom_open chrome_open = new DebugChrom_open();
		googleCheck_Search search = new googleCheck_Search();
		String s = null;
		int i = 0;

		try {

			chrome_open.open();// 크롬창 오픈

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
			ChromeDriver driver = new ChromeDriver(options);

			
			search.Search();//검색하기// 버튼만들어서 최신화가능하도록
			
			
			driver.get("https://meet.google.com/aue-jqnh-trq");//검색 끝나면 종료
			driver.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//값들 가져오기
	
	public List<Object> resultCamon() {
		return resultCamon;

	}

	public int resultCamon_size() {
		try {
			return resultCamon.size();
		} catch (NullPointerException e) {
			return size;
		}
	}

	public List<Object> resultCamoff() {
		return resultCamoff;

	}

	public int resultCamoff_size() {
		try {
			return resultCamoff.size();
		} catch (NullPointerException e) {
			return size;
		}
	}

	public List<Object> resultList() {
		return resultList;

	}

	public int resultList_size() {
		try {
			return resultList.size();
		} catch (NullPointerException e) {
			return size;
		}
	}

	public List<Object> resultOffline() {
		return resultOffline;

	}

	public int resultOffline_size() {
		try {
			return resultOffline.size();
		} catch (NullPointerException e) {
			return size;
		}
	}

}