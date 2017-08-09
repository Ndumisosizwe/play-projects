package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configuration.CDPlayerConfig;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiscTest extends TestCase {

	@Autowired
	private CompactDisc cd;

	@Autowired
	private MediaPlayer player;

	@Test
	public void testCDShouldNotBeBull() {
		assertNotNull(cd);
		System.out.println(cd.play());
	}

	@Test
	public void testPlayerShouldPlaySgtPeppers() {
		assertEquals("Playing Sgt. Pepper's Lonely Hearts by The Beattles", player.play());
	}

}
