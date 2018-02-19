package codingdojo.scrumorg;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {
	
	@Test
	public void testSimple() {
		String input = "12345123451234512345";
		assertEquals(Bowling.playGame(input), 60);
	}
	
	@Test
	public void testGutterBallsAnd9() {
		String input = "9-9-9-9-9-9-9-9-9-9-";
		assertEquals(Bowling.playGame(input), 90);
	}

	@Test
	public void testSpare() {
		String input = "5/54";
		assertEquals(Bowling.playGame(input), 24);
	}
	
	@Test
	public void testStrikes() {
		String input = "XXX";
		assertEquals(Bowling.playGame(input), 30);
		
	}
	
	@Test
	public void testStrikeAfterSpare() {
		String input = "5/X54";
		assertEquals(Bowling.playGame(input), 48);
	}
	
}
