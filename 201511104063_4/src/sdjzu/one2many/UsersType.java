package sdjzu.one2many;

import java.util.HashSet;
import java.util.Set;

public class UsersType {
	private int typeId;
	private String typeName;
	
	private Set<Users> userSet = new HashSet<Users>(0); 
	
	public Set<Users> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<Users> userSet) {
		this.userSet = userSet;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
