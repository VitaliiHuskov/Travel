package entities;

public class Role {

	private Integer roleId;
	private String roleType;

	public Role() {

	}

	public Role(Integer roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return String.format("Role[roleId=%d,roleType=%s]", roleId, roleType);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (roleId != null) ? roleId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (roleId != null) ? (this.getClass().hashCode() + roleId.hashCode()) : super.hashCode();
	}

}
