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
		info.setIpNum("1121.1211.121.11");
		info.setPortNum("221111");
		return info;
	}
}
