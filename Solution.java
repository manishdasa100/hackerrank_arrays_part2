package hackerRank1DarrayPart2;

import java.util.ArrayList;

public class Solution {
	
	public static boolean canWin(int[] game,int leap) {
		ArrayList<Integer> leapCheck = new ArrayList<Integer>();
		boolean check = true;
		
		for(int i = game.length-1;i>=0;i--) {
			if(game[i]==0) {
				if(i+leap>game.length-1 || i+1>game.length-1) {
					leapCheck.add(i);
				}else {
					if(leapCheck.contains(i+leap) || leapCheck.contains(i+1) || (game[i+leap]==0 && leapCheck.contains(i+leap-1))) {
						leapCheck.add(i);
						check = true;
					}else {
						check = false;
					}
				}
			}
		}
		
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] game = {0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
		int leap = 21;
		
		//boolean result = canWin(game,leap);
		
		if(canWin(game,leap)) {
			System.out.println("TRUE");
		}else {
			System.out.println("False");
		}

	}

}
