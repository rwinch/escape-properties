package sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EscapePropertiesApplication.class)
public class EscapePropertiesApplicationTests {
	@Autowired
	MyProperties my;

	@Test
	public void configProps() {
		assertThat(my.getProp()).isEqualTo("G0001.${date:now:yyyyMMdd.HHmmss}");
	}

}
