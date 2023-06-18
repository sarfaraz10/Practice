package abstractionPractice;

public interface Phone {
	
	abstract void processor();
	abstract void camera();
	default void chargingPort() {
		System.out.println("Charging");
	}


}
