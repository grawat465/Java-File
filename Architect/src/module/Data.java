package module;

import java.io.Serializable;

public class Data implements Serializable{

	public String firstname;
	public String lastname;
    public String id;
    public String mail;
    public String password;
     
     
    // String username;
    // String cpassword;
	public Data(String firstname, String lastname, String id, String mail, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.mail = mail;
		this.password = password;
		
		
	}
	public Data() {
		super();
	}
     
     //Data members of class
     @Override
     public String toString() {
    	 
    	 return "Name-->"+this.firstname+" "+"Lastname-->"+this.lastname+" "+"Id-->"+this.id+" "+"Mail-->"+this.mail+" "+"Password-->"+ this.password;
    	 
     }
      
	
}
