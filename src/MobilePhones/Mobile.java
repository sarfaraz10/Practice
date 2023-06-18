package MobilePhones;

import java.util.Objects;

public class Mobile {

	private String company;
	private int ram;
	private int basePrice;
	private double mrp;
	private double discount;
	private double tax;

	public Mobile(String company, int ram) {
		this.company = company;
		this.ram = ram;
//		this.basePrice = basePrice;
//		this.mrp =mrp;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double d) {
		this.mrp = d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(basePrice, company, discount, mrp, ram, tax);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return basePrice == other.basePrice && Objects.equals(company, other.company)
				&& Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount) && mrp == other.mrp
				&& ram == other.ram && Double.doubleToLongBits(tax) == Double.doubleToLongBits(other.tax);
	}

	@Override
	public String toString() {
		return "Mobile [company=" + company + ", ram=" + ram + ", basePrice=" + basePrice + ", mrp=" + mrp
				+ ", discount=" + discount + ", tax=" + tax + "]";
	}

}
