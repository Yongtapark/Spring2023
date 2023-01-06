package test10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class AppConfigRun {
	@Bean
	public SerInfo serverinfo() {
		SerInfo info=new SerInfo();
		info.setIpNum("192.168.86.1");
		info.setPortNum("8081");
		
		return info;
		
	}
}
