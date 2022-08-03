

public class Staff extends Empolyee{
    private String title;

    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

    public String getTitle() {
		return title;
	}
    public void setTitle(String title) {
		this.title = title;
	}
    public String toString() {
		return super.toString() 
		+ "\nPerson{name=" + getName() 
		+ ", address=" + getAddress()
		+ ", phoneNumber=" + getPhone()
		+ ", email=" + getEmail() + "}"
		+ " Staff{office=" + getOffice() + "}"
		+ " Staff{salary=" + getSalary() + "}"
		+ " Staff{title=" + getTitle() + "}";
	}
}
