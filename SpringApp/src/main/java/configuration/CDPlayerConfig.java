package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import soundsystem.BasePackageMarker;

@Configuration
@ComponentScan(basePackageClasses = { BasePackageMarker.class })
public class CDPlayerConfig {
	
}
