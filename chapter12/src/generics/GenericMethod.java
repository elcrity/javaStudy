package generics;

public class GenericMethod {
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		//int name, this.name = name 처럼 makeRectangle메서드에 사용한 <T,V>와 static <T,V>는 다른 의미, 
		//전자는 메서드 내에서만 유효
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width*height;
	}

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);//new Point<>(0,0.0);으로 생략 가능
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		//GenericMethod.<Integer,Double>makeRectangle(p1, p2); <Integer,Double>생략 가능
		double rect = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사격형의 넓이는 " + rect + "입니다.");

	}

}
