package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevel {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		for(int i : solution(progresses,speeds)) {
			System.out.println(i);
		}
	}

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> prog = new LinkedList();
        Queue<Integer> speed = new LinkedList();
        ArrayList<Integer> release = new ArrayList<>();
        for(int i = 0; i<progresses.length; i++) {
        	prog.add(progresses[i]);
        	speed.add(speeds[i]);
        }
        int[] answer = {};
        int day = 1;
        while(!prog.isEmpty()) {
        	int cnt = 0;
        	while(prog.peek() + speed.peek() * day < 100) {
        		day++;
        	}
        	while(!prog.isEmpty() && prog.peek() + speed.peek() * day >= 100 ) {//poll()로 하면 확인하는 과정에서 삭제해버림
        		prog.remove();
        		speed.remove();
        		cnt++;
        	}
        	
        	if(cnt>0)
        		release.add(cnt);	
        }
        answer = new int[release.size()];
        for(int i = 0; i<release.size(); i++) {
        	answer[i] = release.get(i);
        }
        return answer;

    }
}
