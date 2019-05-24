package entities;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer userId;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;
	private Date dateOfBirth;
	private Integer userTourId;

	public User() {

	}

	public User(String firstName, String lastName, String login, String password, String email, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String firstName, String lastName, String login, String password, String email, Date dateOfBirth,
			Integer userTourId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.userTourId = userTourId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getUserTourId() {
		return userTourId;
	}

	public void setUserTourId(Integer userTourId) {
		this.userTourId = userTourId;
	}

	@Override
	public String toString() {
		return String.format("User[userId=%d,firstName=%s,lastName=%s,login=%s,email=%s,dateOfBirth=%t,userTourId=%d]",
				userId, firstName, lastName, login, email, dateOfBirth, userTourId);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (userId != null) ? userId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (userId != null) ? (this.getClass().hashCode() + userId.hashCode()) : super.hashCode();
	}

}
