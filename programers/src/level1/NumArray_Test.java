package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


class NumArray{
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.size() > 0){
            list.sort(null);
            Iterator<Integer> it = list.iterator();
            int i = 0;
            answer = new int[list.size()];
            while(it.hasNext()){
                answer[i] = it.next();
                i++;
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}

public class NumArray_Test {
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		NumArray na = new NumArray();
		System.out.println(Arrays.toString((na.solution(arr, divisor))));

	}
}
