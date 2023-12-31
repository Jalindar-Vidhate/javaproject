package techhubmvccurd1.com.techhub.model;

public class UserModel {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String salary;
	private String deg;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserModel() {
		super();
	}
	public UserModel(String name, String salary, String deg, String address) {
		super();
		this.name = name;
		this.salary = salary;
		this.deg = deg;
		this.address = address;
	}
	
	
	
	
	
}
