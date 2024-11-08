package Rctech.Solutions;

public class Employess {

	private String name;
	private String id;
	private String mailID;
	private String role;
	private String domain;
	private String location;
	public Employess(String name, String id, String mailID, String role, String domain, String location) {
		super();
		this.name = name;
		this.id = id;
		this.mailID = mailID;
		this.role = role;
		this.domain = domain;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employess [name=" + name + ", id=" + id + ", mailID=" + mailID + ", role=" + role + ", domain=" + domain
				+ ", location=" + location + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
