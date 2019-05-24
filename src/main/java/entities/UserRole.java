package entities;

public class UserRole {

	private Integer userRoleId;
	private Integer userId;
	private Integer roleId;

	public UserRole() {

	}

	public UserRole(Integer userRoleId, Integer userId, Integer roleId) {
		super();
		this.userRoleId = userRoleId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return String.format("UserRole[userRoleId=%d,userId=%d,roleId=%d]", userRoleId, userId, roleId);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (userRoleId != null) ? userRoleId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (userRoleId != null) ? (this.getClass().hashCode() + userRoleId.hashCode()) : super.hashCode();
	}
}
