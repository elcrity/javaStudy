package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer Lee = new TravelCustomer("이순신",40,100);
		TravelCustomer Kim = new TravelCustomer("김유신",20,100);
		TravelCustomer Hong = new TravelCustomer("홍길동",13,50);
		List<TravelCustomer> customerList = new ArrayList();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		System.out.println("==고객 명단 추가 순서대로 출력==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
							//이름만 가져옴
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
							//가져와야ㅏ 하는 항목이 int형태이기때문에 mapToInt로 변환
		System.out.println("총 여행 비용은 : " + total +"입니다.");
		
		System.out.println("==20세 이상 고객만 출력==");
		customerList.stream().filter(c->c.getAge() >= 20)//filter조건을 걸고 참인 항목만 가져옴
					.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
					//getAge에서 20살 이상인 사람의 이름만 가져와 정렬후 하나씩 출력
	}

}
