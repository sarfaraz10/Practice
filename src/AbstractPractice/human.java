package AbstractPractice;

public abstract class human extends Employe {

	@Override
	void display() {
		System.out.println("Display method");
	}

	@Override
	void run() {
		System.out.println("Run method");
	}

	@Override
	void walk() {
		System.out.println("Walk method");
	}

	@Override
	void light() {
		System.out.println("Walk method");

	}

}
