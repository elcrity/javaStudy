package level2;

public class TargetNum {

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		int answer = dfs(numbers, 0, 0, target);
		
		System.out.println(answer);
	}
	
	public static int dfs(int[] numbers, int sum, int depth, int target){
        if(numbers.length == depth){
            if(sum == target) return 1;
            else return 0;
        }else{
            return dfs(numbers,sum+numbers[depth], depth+1, target)+
                dfs(numbers,sum-numbers[depth], depth+1, target);
            //depth = 0, numbers[0]부터 각각 +와 -의 경우의 수를 더해 numbers의 길이와 depth가 같고(완전히 탐색)
            //재귀함수로 배열의 각 요소가 +인 경우 -인 경우를 모두 탐색하여 배열이 끝났을때 타겟값과 같으면 1 반환.
            //그 값을 전부 더해 경우의 수 탐색
        }
    }

}
