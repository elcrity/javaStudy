package level1;

public class SumEmptyNum {//���� ���� ���ϱ�

	public static void main(String[] args) {
		    	int[][] numbers = {{1,2,3,4,6,7,8,0},{5,8,4,0,6,7,9}};
		        for(int[] i : numbers){
		        	int answer = 45;
		        	
		        	for(int j : i) {
		        		answer -= j;
		        	}
		        	System.out.println(answer);
		        }
	}

}
