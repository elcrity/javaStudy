package level1;

import java.lang.*;

public class NumStringAlphabet {//숫자 문자열과 영단어
	public static void main(String[] args) {
	        int answer = 0;
	        String[] s = {"one4seveneight","23four5six7","2three45sixseven","123"};
	        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        for(int j = 0; j<4; j++) {
		        for(int i = 0; i<10; i++){
		            s[j] = s[j].replace(num[i],Integer.toString(i));
		        }
	        answer = Integer.parseInt(s[j]);
	        System.out.println(answer);
	        }
	}
}
