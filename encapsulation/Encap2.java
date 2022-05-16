package encapsulation;

class EncapsulationDemo {
	private int ssn;
	private int empAge;
	// Getter and Setter methods
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
class Encap2 {
	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println("Employee SSN: " + obj.getSsn());//0
		System.out.println("Employee Age: " + obj.getEmpAge());//0
		System.out.println("**************************************");
		obj.setEmpAge(32);
		obj.setSsn(112233);
		System.out.println("Employee SSN: " + obj.getSsn());//112233
		System.out.println("Employee Age: " + obj.getEmpAge());// 32
	}
}
