package iteratorPractice;

import java.util.ArrayList;
import java.util.Collections;

public class class2 {
	
	public static void main(String[] args) {
		
//		class1 Class1 = new class1();
//		Set<student> a = Class1.loadData();
//		System.out.println(a);
		
		class1 a = new class1();
		ArrayList<student> b = a.loadData();
		System.out.println(b);
		Collections.sort(b);
		System.out.println(b);
		
	}

}
