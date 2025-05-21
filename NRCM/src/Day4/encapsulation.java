package Day4;

public class encapsulation {
	private String firstname;
	private String lastname;
	private String email;
	private long phonenumber;
	
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public static void main(String[] args) {
		encapsulation e1=new encapsulation();
		e1.setFirstname("sunkam");
		e1.setLastname("sathwika");
		e1.setEmail("sunkamsathwika@gmail.com");
		e1.setPhonenumber(9391114582l);
		System.out.println(e1.getFirstname());
		System.out.println(e1.getLastname());
		System.out.println(e1.getEmail());
		System.out.println(e1.getPhonenumber());
		
		
	}
	
}
