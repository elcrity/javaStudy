package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException{
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();//디폴트 생성자로 새 인스턴스 생성
		System.out.println(person2);
	}

}
