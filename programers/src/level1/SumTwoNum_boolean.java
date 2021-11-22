package level1;

import java.util.ArrayList;

class SumNum{
	public static ArrayList<Integer> Solution(int[] numbers) {
	    ArrayList<Integer> answer = new ArrayList<>();
	    boolean[] check = {};
	    int num = 0;
	    
	    check = new boolean[200];
	    for(int i = 0; i<numbers.length; i++){
	        for(int j = i+1; j<numbers.length; j++){
	            num = numbers[i] + numbers[j];
	            if(!check[num]){
	                answer.add(num);
	                check[num] = true;
	            }
	        }
	    }
	    answer.sort(null);
	    return answer;
	}
}

public class SumTwoNum_boolean {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println(SumNum.Solution(numbers));

	}
}



