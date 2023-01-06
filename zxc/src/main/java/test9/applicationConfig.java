package test9;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import test8.AdminCnn;

@Configuration
public class applicationConfig {
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub.id}")
	private String subId;
	@Value("${sub.pw}")
	private String subPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer  Properties(){
		PropertySourcesPlaceholderConfigurer config=new PropertySourcesPlaceholderConfigurer();
		
		Resource[] location=new Resource[2];
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
		admin.setSubId(subId);
		admin.setSubPw(subPw);
		
		return admin;
		
	}
	
	
}
