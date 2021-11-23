package level1;


class Year2016{
	public String solution(int a, int b) {
        String answer = "";
        int totalDay = 0;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i = 0; i<a-1; i++){
            totalDay += month[i];            
        }
        
        answer = day[(totalDay+b+4)%7];//b-1+5
            
        
        
        return answer;
    }
}

public class Year2016_Test {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		Year2016 year = new Year2016();
		System.out.println(year.solution(a, b));

	}

}
