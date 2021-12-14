package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Status stat = new Status();
		int input;
		
		
		while(true) {
			System.out.println("1. 시작");
			System.out.println("2. 불러오기");
			System.out.println("3. 종료");
			System.out.println();
			input = sc.nextInt();
			if(input == 1) {
				String name;
				System.out.println("시작");
				while(true) {
					System.out.print("이름 입력 : ");
					name = sc.next();
					if(name.length() > 1 && name.length() < 9) {
						break;
					}else {
						System.out.println("이름을 확인해 주세요. 이름은 2자보다 크고 8자보다 작아야 합니다.");
					}
				}
				stat.MakeCha(name);
				stat.showStatus();	
			}else if(input == 2) {
				System.out.println("불러오기");
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
