package test7;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@Configuration//ȯ�漳�� ����
@ImportResource("test7/applicatiationContext7.xml")//xml ���� ������
public class googlecheck_Simple {
	ArrayList<Object> google(){
		
		return null;
	}
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
	public void check() throws IOException {
		WebElement person = null;
		String cam;
		String online = null;
		String teacher = "�ӹ̿�����"; // ����� �̸��� ��������
		String teacherPresent = "�ӹ̿������(���������̼�)"; // ����� �̸��� ��������(���������̼�)�� ������ �����ּ���. ex)�����������(���������̼�)
		// �л� �̸��� ������ �ּ���
		String[] student = { "�ڿ�Ÿ", "�����", "�赿��", "���â", "�����", "�迵��", "����_�����", "������", "������", "������", "������", "�ȿ���",
				"������", "������", "�̰���", "�̹���", "�̿���", "������", "������", "������", "�ϵ���" };
		List<String> studentALL = Arrays.asList(student);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		int i = 0;
		try {

			Path path = Paths.get(System.getProperty("user.dir"), "sec/main/resouce/chromdriver.exe");

			System.setProperty("webdriver.chrom.driver", path.toString());

			System.out.println("�ο� �˻� ���� ���۹��ÿ� �����Ͽ� ��� �ο��� ���̰� ����� �� �� zŰ�� ��������.");
			System.out.println("�����Ͻ÷��� x Ű��, ��� �˻��Ͻ÷��� �ƹ�Ű�� �Է����ּ���");
			s = bf.readLine();

			try {
				Runtime.getRuntime().exec(
						"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");

			} catch (Exception e) {
				Runtime.getRuntime().exec(
						"C:/Program Files/Google/Chrome/Application/chrome.exe --remote-debugging-port=9222 --user-data-dir=\"C:/selenum/AutomationProfile\"");
			}

			while (!s.equals("x")) {

				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().window();

				driver.get("https://meet.google.com/aue-jqnh-trq");// ���� ��Ʈ �ּ�

				Thread.sleep(2000);

				driver.findElement(By.xpath(
						"//*[@id=\"yDmH0d\"]/c-wiz/div/div/div[13]/div[3]/div/div[1]/div[4]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button/span"))
						.click();

				// System.out.println("-----------------------��������
				// ���-------------------------");
				try {
					person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// ��ü���
				} catch (Exception e1) {
					System.out.println("������ ���������̼��̳� �������� ������մϴ�. ��� ������ �Ǹ� zŰ�� �Է��ϼ���");
					bf.readLine();
				} finally {
					person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// ��ü���
				}

				List<WebElement> personName = person.findElements(By.xpath("//*[@class='XEazBc adnwBd']"));// �̸�
				camOn = person.findElements(By.xpath("//*[@class='Gv1mTb-aTv5jf']"));// ����
				// stream = personName.stream().distinct().toArray();

//				resultList=null;
//				resultCamon=null;
//				resultCamoff=null;
				data.removeAll(data);// �ǽð� �ο� Ȯ��
				for (i = 0; i < personName.size(); i++) { // �̸� ã��
					online = personName.get(i).getText();
					if (!online.equals(teacher)) { // ����� �̸� ����
						if (!online.equals(teacherPresent)) { // ����� ���������̼� ����
							if (!online.equals("��")) {
								data.add(online);// �̸��� ������ ����Ʈ�� ����
							}
						}
					}
				}
				resultList = data.stream().distinct().collect(Collectors.toList());// �����ο� Ȯ��, �ߺ� ������ �˿�

				nameData.removeAll(nameData);// �ǽð����� ķŲ��� üũ
				// System.out.println("----------------ķ Ų ��� ---------------------------");
				for (i = 0; i < camOn.size(); i++) {// ���� �ִ��ο� ã��
					cam = camOn.get(i).getAriaRole();
					String mot = camOn.get(i).findElement(By.xpath("./../../../..")).getText();// ������ �θ� �̸��� ����.
					if (cam.equals("Video")) {
						nameData.add(mot);
						camData.add(cam);
						if (!nameData.equals("")) {
							resultCamon = nameData.stream().distinct().collect(Collectors.toList());// �ߺ� ����Ʈ ����
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
				resultCamoff = noCamData.stream().distinct().collect(Collectors.toList()); // �ߺ� ����Ʈ ����

				// ----------------------------------ȸ�����Ӿ����ο�---------------------------------------------
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

				resultOffline = onlineList.stream().distinct().collect(Collectors.toList()); // �ߺ� ����Ʈ ����
				System.out.println(resultOffline);

				System.out.println(
						"------------------------------------------------ STUDENT CHECKER----------------------------------------------------------------");

				try {
					System.out.println("���� �ο� ���\t:" + resultList);// ��ü ����Ʈ
					System.out.println("��" + resultList.size() + "��");
				} catch (NullPointerException e) {
					System.out.println("�ο� ����");
				}
				System.out.println();
				System.out.println();
				try {
					System.out.println("ķ ON\t\t:" + resultCamon);// ķ �ο� �̸�
					System.out.println("��" + resultCamon.size() + "��");

				} catch (NullPointerException e) {
					System.out.println("�ο� ����");
				}
				System.out.println();
				System.out.println();
				try {

					System.out.println("ķ OFF\t\t: " + resultCamoff);// ķ ��Ų �ο�
					System.out.println("��" + resultCamoff.size() + "��");
				} catch (NullPointerException e) {
					System.out.println("�ο� ����");
				}
				System.out.println();
				System.out.println();
				try {

					System.out.println("������\t\t: " + resultOffline);// ������ �ο�
					System.out.println("��" + resultOffline.size() + "��");
				} catch (NullPointerException e1) {
					System.out.println("�ο� ����");
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------");

				System.out.println("�����Ͻ÷��� x Ű��, ��� �ֽ�ȭ �Ͻ÷��� zŰ�� �Է����ּ���");
				s = bf.readLine();

				driver.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��� �ο��� ���̵��� ���ּ���. ��˻��Ϸ��� z�� �Է��ϼ���");
			s = bf.readLine();

			if (s.equals("z")) {
				while (!s.equals("x")) {
					ChromeOptions options = new ChromeOptions();
					options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
					ChromeDriver driver = new ChromeDriver(options);
					driver.manage().window();

					// System.out.println("-----------------------��������
					// ���-------------------------");
					try {
						person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// ��ü���
					} catch (Exception e1) {
						System.out.println("������ ���������̼��̳� �������� ������մϴ�. ��� ������ �Ǹ� zŰ�� �Է��ϼ���");
						bf.readLine();
					} finally {
						person = driver.findElement(By.xpath("//*[@class='axUSnc  P9KVBf']"));// ��ü���
					}

					List<WebElement> personName = person.findElements(By.xpath("//*[@class='XEazBc adnwBd']"));// �̸�
					camOn = person.findElements(By.xpath("//*[@class='Gv1mTb-aTv5jf']"));// ����
					// stream = personName.stream().distinct().toArray();

//					resultList=null;
//					resultCamon=null;
//					resultCamoff=null;
					data.removeAll(data);// �ǽð� �ο� Ȯ��
					for (i = 0; i < personName.size(); i++) { // �̸� ã��
						online = personName.get(i).getText();
						if (!online.equals(teacher)) { // ����� �̸� ����
							if (!online.equals(teacherPresent)) { // ����� ���������̼� ����
								if (!online.equals("��")) {
									data.add(online);// �̸��� ������ ����Ʈ�� ����
								}
							}
						}
					}
					resultList = data.stream().distinct().collect(Collectors.toList());// �����ο� Ȯ��, �ߺ� ������ �˿�

					nameData.removeAll(nameData);// �ǽð����� ķŲ��� üũ
					// System.out.println("----------------ķ Ų ��� ---------------------------");
					for (i = 0; i < camOn.size(); i++) {// ���� �ִ��ο� ã��
						cam = camOn.get(i).getAriaRole();
						String mot = camOn.get(i).findElement(By.xpath("./../../../..")).getText();// ������ �θ� �̸��� ����.
						if (cam.equals("Video")) {
							nameData.add(mot);
							camData.add(cam);
							if (!nameData.equals("")) {
								resultCamon = nameData.stream().distinct().collect(Collectors.toList());// �ߺ� ����Ʈ ����
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
					resultCamoff = noCamData.stream().distinct().collect(Collectors.toList()); // �ߺ� ����Ʈ ����
					// ----------------------------------���Ӿ����ο�---------------------------------------------
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

					resultOffline = onlineList.stream().distinct().collect(Collectors.toList()); // �ߺ� ����Ʈ ����

					System.out.println(
							"------------------------------------------------STUDENT CHECKER----------------------------------------------------------------");
					System.out.println("�� �ο� :" + studentALL.size() + "��");
					try {
						System.out.println("���� �ο� ���\t:" + resultList);// ��ü ����Ʈ
						System.out.println("��" + resultList.size() + "��");
					} catch (NullPointerException e1) {
						System.out.println("�ο� ����");
					}
					System.out.println();
					System.out.println();
					try {
						System.out.println("ķ ON\t\t:" + resultCamon);// ķ �ο� �̸�
						System.out.println("��" + resultCamon.size() + "��");

					} catch (NullPointerException e1) {
						System.out.println("�ο� ����");
					}
					System.out.println();
					System.out.println();
					try {

						System.out.println("ķ OFF\t\t: " + resultCamoff);// ķ ��Ų �ο�
						System.out.println("��" + resultCamoff.size() + "��");
					} catch (NullPointerException e1) {
						System.out.println("�ο� ����");
					}
					System.out.println();
					System.out.println();
					try {

						System.out.println("������\t\t: " + resultOffline);// ������ �ο�
						System.out.println("��" + resultOffline.size() + "��");
					} catch (NullPointerException e1) {
						System.out.println("�ο� ����");
					}

					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------------------");

					System.out.println("�����Ͻ÷��� x Ű��, ��� �ֽ�ȭ �Ͻ÷��� zŰ�� �Է����ּ���");
					s = bf.readLine();
					if (s.equals("x")) {
						driver.get("https://meet.google.com/aue-jqnh-trq");
						driver.close();
					}

				}

			}
		}
		
			
			
		}
	
	public void result() {
		ArrayList<Object> trans = new ArrayList<Object>();
		trans.add(resultOffline);
		
	}
}
