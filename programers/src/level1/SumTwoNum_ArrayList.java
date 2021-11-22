package level1;

import java.util.ArrayList;
import java.util.Arrays;

class SumNum_AL{
	public static ArrayList<Integer> solution(int[] numbers) {
		ArrayList<Integer> nList = new ArrayList<>();
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = i+1; j<numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				if(nList.indexOf(num)<0) {
					nList.add(num);
				}
			}
		}
		nList.sort(null);
		return nList;
	}
}

class SumNum_answer{
	public static int[] solution(int[] numbers) {
		ArrayList<Integer> nList = new ArrayList<>();
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = i+1; j<numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				if(nList.indexOf(num)<0) {
					nList.add(num);
				}
			}
		}
		int[] answer = new int[nList.size()];
		for(int i = 0; i<nList.size(); i++) {
			answer[i] = nList.get(i);
		}
		
		Arrays.sort(answer);
		return answer;
	}
}

public class SumTwoNum_ArrayList {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println("ArrayLsit : "+SumNum_AL.solution(numbers));
		System.out.println("ArrayLsit -> int[] : "+Arrays.toString(SumNum_answer.solution(numbers)));

	}

}
