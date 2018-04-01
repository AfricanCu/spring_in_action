package soundsystem;

import org.springframework.stereotype.Component;

/**
 * CD接口的一个实现
 * @author 周明军
 * @date 2018年4月1日
 */
@Component
public class SgtPeppers implements CompactDisc {
	private String title = "命运交响曲";
	private String artist = "贝多芬";

	@Override
	public void play() {
		System.out.println(artist + " 演奏 " + title);
	}
}
