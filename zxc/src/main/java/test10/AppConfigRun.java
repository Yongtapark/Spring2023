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
		info.setIpNum("111.111.11.11");
		info.setPortNum("1111");
		return info;
	}
}
