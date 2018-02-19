package codingdojo.scrumorg;

public class Bowling {
	public static int playGame(String input) {
		int score = 0;
		char[] c_arr = input.toCharArray();
		for (int index = 0; index < c_arr.length; index++) {
			Character c = c_arr[index];
				// handle spares
			if (c.equals('/')) {
					// strike after spare
				if (c_arr[index+1] == 'X') {
					score = score + 20 - Character.getNumericValue(c_arr[index-1]);
				}
					// non-strike after spare
				else {
					score = score + 10 - Character.getNumericValue(c_arr[index-1]) + Character.getNumericValue(c_arr[index+1]);
				}
			}
				// handle strikes
			else if (c.equals('X')) {
					// last roll
				if (index == c_arr.length-1) {
					score = score + 10;
				}
					// two strikes in a row
				else if (index < c_arr.length-1 &&  c_arr[index+1] == 'X') {
					// three strikes in a row
					if (index < c_arr.length-2  && c_arr[index+2] == 'X') {
						score = score + 30;
					}
					// strike then spare
					else if (c_arr[index+2] == '/') {
						score = score + 20;
					}
						// two strikes and non-strike
					else {
						score = 20 + Character.getNumericValue(c_arr[index+2]);
					}
				}
					// strike then two regular scoring balls
				else {
					score = score + 10 + Character.getNumericValue(c_arr[index+1]) + Character.getNumericValue(c_arr[index+2]);
				}
			}
				// handle scoring rolls not strike or spare
			else if (!c.equals('-')) {
				score = score + Integer.parseInt(c.toString());
			}
		}
		return score;
	}
}
