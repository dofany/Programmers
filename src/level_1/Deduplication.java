package level_1;

import java.util.*;

public class Deduplication {
    public int[] solution(int []arr) {
    	int[]answer = {};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int temp = 10;
		
		for(int num : arr) {
			if(temp!=num)
				ar.add(num);
			temp = num;
		}
		
		answer = new int[ar.size()];
		for(int i = 0; i<ar.size();i++) {
			answer[i] = ar.get(i);
		}
		
        return answer;
    }
}