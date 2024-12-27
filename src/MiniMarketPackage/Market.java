package MiniMarketPackage;

public class Market {

	private String name;
	private String username;
	private String email;
	private long mno;
	private String area;
	private String role;
	private int password;
	
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public long getMno() {
		return mno;
	}
	public String getArea() {
		return area;
	}
	public String getRole() {
		return role;
	}
	public int getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public Market(String name, String username, String email, long mno, String area, String role, int password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.mno = mno;
		this.area = area;
		this.role = role;
		this.password = password;
	}
	@Override
	public String toString()
	{
		return "Name :"+name+"\nUsername :"+username+"\nEmail :"+email
				+"\nMobile No :"+mno+"\nArea :"+area;
	}
}
