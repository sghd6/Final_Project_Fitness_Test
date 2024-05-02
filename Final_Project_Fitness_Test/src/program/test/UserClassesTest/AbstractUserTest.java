package program.test.UserClassesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import program.main.UserClasses.Beginner;
import program.main.WorkoutStrategies.WorkoutStyleType;

class AbstractUserTest {
	
	
///Create a Beginner Subclass to test Abstract Methods. This will show that variable can be read and edited.
	Beginner Kamala = new Beginner("Kamala",35,152.4,56.8,50,30,40,9);


	@Test
	void testAbstractUser() {
		fail("Not yet implemented");
	}

	@Test
	void testAbstractUserStringIntDoubleDouble() {
		fail("Not yet implemented");
	}
/////Getter Setter Name Tests
	@Test
	void testGetUserName() {
		assertEquals("Kamala", Kamala.getUserName());
	}

	@Test
	void testSetUserName() {
		Kamala.setUserName("Ka");
		assertEquals("Ka", Kamala.getUserName());
	}

	@Test
	void testGetAge() {
		assertEquals(35,Kamala.getAge());
	}

	@Test
	void testSetAge() {
		Kamala.setAge(36);
		assertEquals(36,Kamala.getAge());
	}

	@Test
	void testGetWeight() {
		assertEquals(56.8,Kamala.getWeight());
	}

	@Test
	void testSetWeight() {
		Kamala.setWeight(57.9);
		assertEquals(57.9,Kamala.getWeight());
	}

	@Test
	void testGetHeight() {
		assertEquals(152.4,Kamala.getHeight());
	}

	@Test
	void testSetHeight() {
		Kamala.setHeight(153);
		//She had a late growth spurt
		assertEquals(153,Kamala.getHeight());
	}

	@Test
	void testGetPushupGoal() {
		assertEquals(50,Kamala.getPushupGoal());
	}

	@Test
	void testSetPushupGoal() {
		Kamala.setPushupGoal(55);
		assertEquals(55,Kamala.getPushupGoal());
	}

	@Test
	void testGetSitupGoal() {
		assertEquals(30, Kamala.getSitupGoal());
	}

	@Test
	void testSetSitupGoal() {
		Kamala.setSitupGoal(35);
		assertEquals(35, Kamala.getSitupGoal());
	}

	@Test
	void testGetSquatGoal() {
		assertEquals(40,Kamala.getSquatGoal());
	}

	@Test
	void testSetSquatGoal() {
		Kamala.setSquatGoal(45);
		assertEquals(45,Kamala.getSquatGoal());
	}

	@Test
	void testGetRunGoal() {
		assertEquals(9, Kamala.getRunGoal());
	}

	@Test
	void testSetRunGoal() {
		Kamala.setRunGoal(10);
		assertEquals(10,Kamala.getRunGoal());
	}

	@Test
	void testGetWorkoutStrategyy() {
		assertEquals(null,Kamala.getWorkoutStrategyy());
	}

	//@Test
	//void testSetWorkoutStrategy() {
	//	fail("Not yet implemented");
	//}

	@Test
	void testSetHeightInchToCentimeter() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHeightCentimeterToInch() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWeightPoundtoKilogram() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWeightKilogramtoPound() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		assertEquals("User [name= Kamala, age= 35,height= 152.4,weight= 56.8]", Kamala.toString());
	}

}
