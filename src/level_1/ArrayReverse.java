package level_1;

public class ArrayReverse {
	public int[] solution(long n) {
		String s = "" + n;
		int[] answer = new int[s.length()];
		int temp = 0;
		while(n>0) {
			answer[temp]=(int)(n%10);
			n/=10;
			temp++;
		}
		return answer;
	}
}
