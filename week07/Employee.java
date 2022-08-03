

import java.util.Date;

public class Employee extends Person {
    private int office;
	private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phone, String email, int office, double salary){
        super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
        this.dateHired = new Date();
    }

    public int getOffice() {
		return office;
	} 
    public void setOffice(int office) {
		this.office = office;
	}

    public String getSalary() {
		return String.format("%.2f", salary);
	}
    public void setSalary(double salary) {
		this.salary = salary;
	}

    public Date getDateHired() {
		return this.dateHired;
	}
    public void setDateHired() {
		dateHired = new Date();
	}
    public String toString() {
		return super.toString();
	}
}