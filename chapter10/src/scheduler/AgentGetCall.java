package scheduler;

public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화를 가져감");
	}
	
}
