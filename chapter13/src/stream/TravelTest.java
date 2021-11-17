package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer Lee = new TravelCustomer("�̼���",40,100);
		TravelCustomer Kim = new TravelCustomer("������",20,100);
		TravelCustomer Hong = new TravelCustomer("ȫ�浿",13,50);
		List<TravelCustomer> customerList = new ArrayList();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		System.out.println("==�� ��� �߰� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
							//�̸��� ������
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
							//�����;ߤ� �ϴ� �׸��� int�����̱⶧���� mapToInt�� ��ȯ
		System.out.println("�� ���� ����� : " + total +"�Դϴ�.");
		
		System.out.println("==20�� �̻� ���� ���==");
		customerList.stream().filter(c->c.getAge() >= 20)//filter������ �ɰ� ���� �׸� ������
					.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
					//getAge���� 20�� �̻��� ����� �̸��� ������ ������ �ϳ��� ���
	}

}
