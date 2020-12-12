package ma.enset.securityservice.dto;

import lombok.Data;

public class RoleUserForm {
    private String userName;
    private String roleName;
	public RoleUserForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleUserForm(String userName, String roleName) {
		super();
		this.userName = userName;
		this.roleName = roleName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
    
}
