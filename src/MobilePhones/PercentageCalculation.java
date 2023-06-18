package MobilePhones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PercentageCalculation {

	public static void main(String[] args) {

		List<Mobile> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Mobile("Samsung", 8), new Mobile("Apple", 4), new Mobile("Oppo", 8)));

		for (Mobile m : list) {
			if (m.getRam() >= 8) {
				m.setBasePrice(20000);
			} else if (m.getRam() < 8) {
				m.setBasePrice(12000);
			}
			if (m.getBasePrice() >= 20000) {
				m.setTax(m.getBasePrice() * 14 / 100);
			}
			if (m.getBasePrice() <= 20000) {
				m.setTax(m.getBasePrice() * 12 / 100);
			}
			m.setMrp(m.getTax() + m.getBasePrice());

			m.setDiscount(m.getMrp() * 5 / 100);

			System.out.println(m);

		}

	}

}
