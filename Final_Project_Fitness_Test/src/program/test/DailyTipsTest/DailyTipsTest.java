package program.test.DailyTipsTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import program.main.DailyTips.DailyTips;

class DailyTipsTest {

	private DailyTips t = new DailyTips();
	
	@Test
	void testDisplayDailyTip() {
		
	  t.displayDailyTip();
	}

}
