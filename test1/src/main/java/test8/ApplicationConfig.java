package test8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub.id}")
	private String subId;
	@Value("${sub.pw}")
	private String subPw;
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		//외부 파일을 읽어 올 수 있게 하는 환경 객체 생성
		PropertySourcesPlaceholderConfigurer config=new PropertySourcesPlaceholderConfigurer();
		
		Resource[] location =new Resource[2];
		location[0]=new ClassPathResource("admin.properties");
		location[1]=new ClassPathResource("sub.properties");
		
		config.setLocations(location);
		
		return config;
	}
	@Bean
	public AdminCnn adminconfig() {
		AdminCnn admin=new AdminCnn();
		admin.setAdminId(adminId);
		admin.setAdminPw(adminPw);
		admin.setSub_adminId(subId);
		admin.setSub_adminPw(adminId);
		
		
		return admin;
		
	}
}
