package phu.quang.le.DataBinding;

public class Customer {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String creditCardNumber;

	public String getCreditCardNumber () {
		return creditCardNumber;
	}

	public String getFirstName () {
		return firstName;
	}

	public String getLastName () {
		return lastName;
	}

	public String getPassword () {
		return password;
	}

	public String getUsername () {
		return username;
	}

	public void setCreditCardNumber (String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public void setLastName (String lastName) {
		this.lastName = lastName;
	}

	public void setPassword (String password) {
		this.password = password;
	}

	public void setUsername (String username) {
		this.username = username;
	}
}
