package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 능력평가가 좋은 상담원에게 우선적 배분");
	}

}
