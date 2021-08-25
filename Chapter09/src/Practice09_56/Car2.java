package Practice09_56;

public abstract class Car2 {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("¼¼Â÷ÇÔ");
	}
	
	final public void run(){
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
