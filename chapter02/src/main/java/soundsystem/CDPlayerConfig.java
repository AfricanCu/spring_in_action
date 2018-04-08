package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
/*	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
	@Bean
	public CDPlayer anotherCDPlayer() {
		return new CDPlayer(sgtPeppers());
	}*/
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		System.out.println("cdPlayer " + compactDisc);
		return new CDPlayer(compactDisc);
	}
	@Bean
	public CDPlayer anotherCDPlayer(CompactDisc compactDisc) {
		System.out.println("anotherCDPlayer " + compactDisc);
		return new CDPlayer(compactDisc);
	}
}