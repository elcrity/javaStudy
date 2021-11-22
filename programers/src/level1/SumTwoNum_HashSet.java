package level1;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class SumNum_HashSet{
	public static String solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.toString();
        //parseInt�� static, String�� ��ü���� int�� ������ String -> int
	}
}

class SumNum_HashSet_Integer{
	public static Set<Integer> solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set;
        //parseInt�� static, String�� ��ü���� int�� ������ String -> int
	}
}

class SumNum_HashSet_Stream{
	public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        
        int[] answer = {};
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();//set�� ��Ʈ������ ����, ������ Integer��ü���� int�� ��ȯ�� �迭�� ��ȯ
        return answer;
        //parseInt�� static, String�� ��ü���� int�� ������ String -> int
	}
}



public class SumTwoNum_HashSet {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println("ArrayList : "+Arrays.toString(SumNum_HashSet_Stream.solution(numbers)));
		System.out.println("ArrayList : "+SumNum_HashSet_Integer.solution(numbers));
		System.out.println("ArrayList : "+SumNum_HashSet.solution(numbers));
	}

}
