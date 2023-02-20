package com.example.demoversion2;

import com.example.demoversion2.entites.Version;
import com.example.demoversion2.repositories.VersionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoVersion2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoVersion2Application.class, args);
	}
@Bean
	CommandLineRunner start(VersionRepository versionRepository){
		return args -> {
			versionRepository.save(new Version(null,"android","1.0"));
					versionRepository.findAll().forEach(v-> { System.out.println(v.toString());});
		};
}
}
