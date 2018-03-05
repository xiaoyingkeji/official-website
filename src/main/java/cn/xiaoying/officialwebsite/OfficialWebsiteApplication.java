package cn.xiaoying.officialwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.xiaoying.officialwebsite")
public class OfficialWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficialWebsiteApplication.class, args);
	}
}
