package java_study.chapter07.sec03;

public class Computer {
	private int price;
	private String manufacture;
	private int monitorSize;

	public Computer() {
		super();
	}

	public Computer(int price, String manufacture, int monitorSize) {
		super();
		this.price = price;
		this.manufacture = manufacture;
		this.monitorSize = monitorSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", manufacture=" + manufacture + ", monitorSize=" + monitorSize + "]";
	}
}
