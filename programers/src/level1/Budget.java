package level1;
import java.util.Arrays;

public class Budget {//¿¹»ê

	public static void main(String[] args) {
		int[] d1 = {1,3,2,5,4};
		int[] d2 = {2,2,3,3};
		Arrays.sort(d1);
		Arrays.sort(d2);
		int[][] d = {d1,d2};
		
		int budget = 9;
		for(int[] a : d) {
			int answer = 0;
			for(int i : a){
				budget -= i;
			    if(budget < 0)
			    	break;
				answer++;
			 }
			 System.out.println(answer);
			 budget = 10;
		}
		
//		int budget = 9;
		
		

		
//		int answer = 0;
//		for(int i : d){
//			budget -= i;
//		    if(budget < 0)
//		    	break;
//			answer++;
//		 }
//		 System.out.println(answer);
	}

}
