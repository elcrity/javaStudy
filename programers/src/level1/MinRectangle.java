package level1;

class Comparison_R{
    public int solution(int[][] sizes) {
        int answer = 0;
        int l = 0;
        int s = 0;
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                l = Math.max(sizes[i][0],l);
                s = Math.max(sizes[i][1],s);
            }else{
                l = Math.max(sizes[i][1],l);
                s = Math.max(sizes[i][0],s);
            }
        }
        answer = l*s;
        return answer;
    }
}

public class MinRectangle {

	public static void main(String[] args) {
		int sizes[][] = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		Comparison_R com = new Comparison_R();
		System.out.println(com.solution(sizes));

	}

}
