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
        
        HashMap<String, Integer> map = new HashMap<>();//���� Ű�� String, ����� Integer�� map�ؽ��� ����
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0)+1);
            //�ؽ��� map��(player�� Ű�� player�� (������ �����, ������ 0)+1�� ����� �Է�
        }
        // System.out.println("parti : "+map);
        // System.out.println("comple : "+map);
        
        for(String player : completion){
            map.put(player, map.get(player)-1);
            //�ؽ��� map��(player�� Ű�� player�� ������ ���-1�� ����� �Է�
        }
        // System.out.println("par:"+map);
        // System.out.println("comple : "+map);
        
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        //Map.Entry<String,Integer> -> Ű ����� <String,integer>�� ���� �ؽ��� ����
        //HashMap.entrySet(); HashMap�� Ű ��� ��ȯ.
        //Iterator<T>	iterator() T������ ��� ���� ���·� �ݺ��� ��ȯ
        //Ű-�����<String,Integer>�� ���� �ؽ��� ���·� map�� Ű-����� �ݺ��� ��ȯ
        
        
        while(iter.hasNext()){//iter�� ���� �о�� ��Ұ� ������
            Map.Entry<String,Integer> entry = iter.next();
            //<String,Integer>���·� Ű-����� ���� entry�� iter�� ���� ��� ����
            if(entry.getValue() != 0){//entry�� ����� 0�� �ƴҶ�
                answer = entry.getKey();//Ű�� ��ȯ
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
