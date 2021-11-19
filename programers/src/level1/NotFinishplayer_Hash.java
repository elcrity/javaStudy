package level1;

import java.util.*;

class FindNotFinish_Hash {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // List<String> temp = new ArrayList<String>(Arrays.asList(participant));
        // System.out.println(temp);
        // for(int i = 0; i<completion.length; i++){
        //     temp.remove(completion[i]);
        // }
        // answer = String.join(",",temp);
        
        HashMap<String, Integer> map = new HashMap<>();//각각 키는 String, 밸류는 Integer의 map해쉬맵 생성
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0)+1);
            //해쉬맵 map에(player를 키값 player에 (지정된 밸류값, 없으면 0)+1을 밸류로 입력
        }
        // System.out.println("parti : "+map);
        // System.out.println("comple : "+map);
        
        for(String player : completion){
            map.put(player, map.get(player)-1);
            //해쉬맵 map에(player를 키값 player에 지정된 밸류-1을 밸류로 입력
        }
        // System.out.println("par:"+map);
        // System.out.println("comple : "+map);
        
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        //Map.Entry<String,Integer> -> 키 밸류로 <String,integer>를 가진 해쉬맵 형식
        //HashMap.entrySet(); HashMap의 키 밸류 반환.
        //Iterator<T>	iterator() T형태의 요소 집합 형태로 반복자 반환
        //키-밸류를<String,Integer>로 가진 해쉬맵 형태로 map의 키-밸류로 반복자 반환
        
        
        while(iter.hasNext()){//iter에 다음 읽어올 요소가 있을시
            Map.Entry<String,Integer> entry = iter.next();
            //<String,Integer>형태로 키-밸류를 가진 entry에 iter의 다음 요소 대입
            if(entry.getValue() != 0){//entry의 밸류가 0이 아닐때
                answer = entry.getKey();//키값 반환
                break;
            }     
        }
        return answer;
    }
}


public class NotFinishplayer_Hash {

	public static void main(String[] args) {
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] complement = {"josipa", "filipa", "marina", "nikola"};
		FindNotFinish_Hash notfinish = new FindNotFinish_Hash();
		System.out.println(notfinish.solution(participant, complement));

	}

}
