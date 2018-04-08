package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	@Qualifier("cdPlayer")
	private MediaPlayer cd;

	@Autowired
	@Qualifier("anotherCDPlayer")
	private MediaPlayer anotherCD;

	@Test
	public void cdShouldNotBeNull() {
		System.out.println(cd);
		System.out.println(anotherCD);
		cd.play();
	}
}