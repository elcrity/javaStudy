package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Status stat = new Status();
		int input;
		
		
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. �ҷ�����");
			System.out.println("3. ����");
			System.out.println();
			input = sc.nextInt();
			if(input == 1) {
				String name;
				System.out.println("����");
				while(true) {
					System.out.print("�̸� �Է� : ");
					name = sc.next();
					if(name.length() > 1 && name.length() < 9) {
						break;
					}else {
						System.out.println("�̸��� Ȯ���� �ּ���. �̸��� 2�ں��� ũ�� 8�ں��� �۾ƾ� �մϴ�.");
					}
				}
				stat.MakeCha(name);
				stat.showStatus();	
			}else if(input == 2) {
				System.out.println("�ҷ�����");
//				System.out.println(cha.getLv());
//				System.out.println(cha.getName());
//				System.out.println(cha.getHp());
//				System.out.println(cha.getMp());
//				System.out.println(cha.getMaxHp());
//				System.out.println(cha.getMaxMp());
			}else if(input == 3) {
				break;
			}
		}	
	}
}
