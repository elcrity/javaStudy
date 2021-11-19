package level1;


import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		  
		 int [] array1 = {1, 5, 2, 6, 3, 7, 4};
		 int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};	
		 for(int i : array1){
		  System.out.print(i +" "); 
		 }
		 
		 System.out.println();
		 
		 int [] array2 = Arrays.copyOf(array1, 3);
		 
		 for(int i : array2){
		  System.out.print(i +" "); 
		 }
		 
		 System.out.println();
		 for(int i = 0; i<commands.length; i++){
		    int [] array3 = Arrays.copyOfRange(array1,commands[0][0]-1,commands[0][1]);  
		 
		    	System.out.print(array3[0] +" "); 
		 }

	}

}
