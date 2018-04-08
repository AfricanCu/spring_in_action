package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	private String title = "致爱丽丝";
	private String artist = "贝多芬";

	@Override
	public void play() {
		System.out.println(artist + "正在弹奏" + title);
	}
}
