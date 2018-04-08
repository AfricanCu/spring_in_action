package soundsystem;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println(artist + "正在弹奏" + title);
	}

}
