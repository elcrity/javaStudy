package chapter4;

public class PracticeQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12,num2 = 3, sum = 0;
		char operator = '*';
		
		if(operator == '+') {
			sum=num1+num2;
		}else if(operator == '-') {
			sum=num1-num2;
		}else if(operator == '*') {
			sum=num1*num2;
		}else if(operator == '/') {
			sum=num1/num2;
		}
		System.out.println(sum);
		
		switch(operator){
			case '+' : 
				sum = num1+num2;
				break;
			case '-' : 
				sum = num1-num2;
				break;
			case '*' : 
				sum = num1*num2;
				break;
			case '/' : 
				sum = num1/num2;
				break;
		}
		System.out.println(sum);

	}

}
