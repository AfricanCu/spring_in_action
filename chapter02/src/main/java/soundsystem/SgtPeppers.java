package soundsystem;

import org.springframework.stereotype.Component;

/**
 * CD接口的一个实现
 * @author 周明军
 * @date 2018年4月1日
 */
@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Peper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
