package soundsystem;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
	
	@Test
	public void demo01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CompactDisc bean = context.getBean("compactDisc", CompactDisc.class);
		bean.play();
	}

}
