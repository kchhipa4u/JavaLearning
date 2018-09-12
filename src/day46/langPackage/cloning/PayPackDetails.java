package day46.langPackage.cloning;

public class PayPackDetails implements Cloneable{
	private double basicSalary = 500000d;
	private double incentive = 50000d;

	public double getSalary() {
		return getBasicSalary() + getIncentive();
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

    public 	PayPackDetails clone() throws CloneNotSupportedException{
    	return (PayPackDetails) super.clone();
    }
	
	@Override
	public String toString() {
		return "PayPackDetails [basicSalary=" + basicSalary + ", incentive=" + incentive + "]";
	}
}
