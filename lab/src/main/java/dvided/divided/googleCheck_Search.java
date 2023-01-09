package dvided.divided;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googleCheck_Search {
	WebElement person = null;
	String cam;
	String online = null;
	String teacher = new Teacher().teacher();
	String teacherPresent = new Teacher().teacher_pre(); // 강사님 이름을 적으세요(프레젠테이션)은 지우지 말아주세요. ex)ㅇㅇㅇ강사님(프레젠테이션)
	Student studentList=new Student();
	 int size;
	String[] student = studentList.nameList();// 학생 이름을 기입해 주세요
	List<String> studentALL = Arrays.asList(student);
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	DebugChrom_open chrome_open =new DebugChrom_open();
	String s = null;
	int i = 0;
	
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
	public void Search() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		ChromeDriver driver = new ChromeDriver(options);
		
		

		// System.out.println("-----------------------접속중인
		// 명단-------------------------");
		

			// System.out.println("-----------------------접속중인
			// 명단-------------------------");
			try {
				person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// 전체명단
			} catch (Exception e1) {
				System.out.println("고정된 프레젠테이션이나 동영상이 없어야합니다. 모두 설정이 되면 z키를 입력하세요");
				bf.readLine();
			} finally {
				person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// 전체명단
			}

			List<WebElement> personName = person.findElements(By.xpath("//*[@class='XEazBc adnwBd']"));// 이름
			camOn = person.findElements(By.xpath("//*[@class='Gv1mTb-aTv5jf']"));// 비디오
			// stream = personName.stream().distinct().toArray();

//			resultList=null;
//			resultCamon=null;
//			resultCamoff=null;
			data.removeAll(data);// 실시간 인원 확인
			for (i = 0; i < personName.size(); i++) { // 이름 찾기
				online = personName.get(i).getText();
				if (!online.equals(teacher)) { // 강사님 이름 제외
					if (!online.equals(teacherPresent)) { // 강사님 프레젠테이션 제외
						if (!online.equals("나")) {
							data.add(online);// 이름을 데이터 리스트에 저장
						}
					}
				}
			}
			resultList = data.stream().distinct().collect(Collectors.toList());// 최종인원 확인, 중복 데이터 검열

			nameData.removeAll(nameData);// 실시간으로 캠킨사람 체크
			// System.out.println("----------------캠 킨 사람 ---------------------------");
			for (i = 0; i < camOn.size(); i++) {// 비디오 있는인원 찾기
				cam = camOn.get(i).getAriaRole();
				String mot = camOn.get(i).findElement(By.xpath("./../../../..")).getText();// 비디오의 부모 이름이 나옴.
				if (cam.equals("Video")) {
					nameData.add(mot);
					camData.add(cam);
					if (!nameData.equals("")) {
						resultCamon = nameData.stream().distinct().collect(Collectors.toList());// 중복 리스트 제거
					}
				}
			}
			noCamData.removeAll(noCamData);
			for (Object a : resultList) {
				boolean isEquals = false;
				for (Object b : nameData) {
					if (a.equals(b))
						isEquals = true;
				}
				if (!isEquals) {
					noCamData.add(a);
				}
			}
			resultCamoff = noCamData.stream().distinct().collect(Collectors.toList()); // 중복 리스트 제거
			// ----------------------------------접속안한인원---------------------------------------------
			onlineList.removeAll(onlineList);
			for (Object c : studentALL) {
				boolean isEquals = false;
				for (Object d : resultList) {
					if (c.equals(d))
						isEquals = true;
				}
				if (!isEquals) {
					onlineList.add(c);
				}
			}

			resultOffline = onlineList.stream().distinct().collect(Collectors.toList()); // 중복 리스트 제거

			System.out.println(
					"------------------------------------------------STUDENT CHECKER----------------------------------------------------------------");
			System.out.println("총 인원 :" + studentALL.size() + "명");
			try {
				System.out.println("접속 인원 명단\t:" + resultList);// 전체 리스트
				System.out.println("총" + resultList.size() + "명");
			} catch (NullPointerException e1) {
				
				System.out.println("인원 없음");
			}
			System.out.println();
			System.out.println();
			try {
				System.out.println("캠 ON\t\t:" + resultCamon);// 캠 인원 이름
				System.out.println("총" + resultCamon.size() + "명");

			} catch (NullPointerException e1) {
				System.out.println("인원 없음");
			}
			System.out.println();
			System.out.println();
			try {

				System.out.println("캠 OFF\t\t: " + resultCamoff);// 캠 안킨 인원
				System.out.println("총" + resultCamoff.size() + "명");
			} catch (NullPointerException e1) {
				System.out.println("인원 없음");
			}
			System.out.println();
			System.out.println();
			try {

				System.out.println("미접속\t\t: " + resultOffline);// 미접속 인원
				System.out.println("총" + resultOffline.size() + "명");
			} catch (NullPointerException e1) {
				System.out.println("인원 없음");
			}

			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------");
	}
}
