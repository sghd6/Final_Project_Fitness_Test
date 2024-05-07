package program.test.ActivityTest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

import program.main.ActivityTracker.Activity;

class ActivityTest {

	
	
	private Activity Activity = new Activity("situp", 20, 50, LocalDateTime.now());
	
	@Test
	void testActivity() {
		Activity Activity2 = new Activity("situp", 20, 50, LocalDateTime.now());
	}
		

	@Test
	void testGetActivityType() {
		assertEquals("situp",Activity.getActivityType());
	}

	@Test
	void testGetDuration() {
		assertEquals(20,Activity.getDuration());
	}

	@Test
	void testGetIntensity() {
		assertEquals(50,Activity.getIntensity());
	}

	@Test
	void testDateTime() {
		Activity Activity2 = new Activity("situp", 20, 50, LocalDateTime.now());
		assertEquals(LocalDateTime.now(),Activity2.dateTime());
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

}
