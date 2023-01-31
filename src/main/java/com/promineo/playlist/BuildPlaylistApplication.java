package com.promineo.playlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineo.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})
public class BuildPlaylistApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildPlaylistApplication.class, args);
	}

}
