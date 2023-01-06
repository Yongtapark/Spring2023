package test10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class AppConfigTest {
	@Bean
	public SerInfo serverinfo() {
		SerInfo info=new SerInfo();
		info.setIpNum("192.168.86.1");
		info.setPortNum("�����");
		
		return info;
		}
		
}
