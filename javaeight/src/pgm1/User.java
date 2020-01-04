package pgm1;

public class User {

	private int userId;
	private String userName;
	private double salary;
	private int userAge;

	public User() {
		super();
	}

	public User(int userId, String userName, double salary, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.salary = salary;
		this.userAge = userAge;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

}
