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
            //depth = 0, numbers[0]���� ���� +�� -�� ����� ���� ���� numbers�� ���̿� depth�� ����(������ Ž��)
            //����Լ��� �迭�� �� ��Ұ� +�� ��� -�� ��츦 ��� Ž���Ͽ� �迭�� �������� Ÿ�ٰ��� ������ 1 ��ȯ.
            //�� ���� ���� ���� ����� �� Ž��
        }
    }

}
