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
        //parseInt는 static, String형 객체에서 int를 가져옴 String -> int
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
        //parseInt는 static, String형 객체에서 int를 가져옴 String -> int
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
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();//set을 스트림으로 생성, 정렬후 Integer객체에서 int로 변환후 배열로 변환
        return answer;
        //parseInt는 static, String형 객체에서 int를 가져옴 String -> int
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
