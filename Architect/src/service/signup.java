package service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import dao.DbFunctions;
import module.Data;
public class signup {
	
	 public void getsignupData() throws FileNotFoundException, IOException {
		 Scanner sc=new Scanner(System.in);
		 Validation1 v=new Validation1();
		 System.out.println("Enter Details");
		 System.out.println("First name");	
		 String firstname="";
		 String firstnametemp="";
		 String lastnametemp="";
		 String mailtemp="";
		 String passwordtemp="" ;
		 String id="";
		
		 boolean run=true;
		 while(run)
		 { 
			 firstnametemp= sc.nextLine();
		 if(v.validateFirstName(firstnametemp))
		 {
			 
			 firstname=firstnametemp;
			 run=false;
			 
		 }
		 else { 
			 System.out.println("Re-Enter your firstname");
			 run=true;
		 }
		 }
			 run=true;
			 System.out.println("Enter your Last name");
		 String lastname = null;
		 while(run) {
		 	lastnametemp =sc.nextLine();
		 if(v.validateLastName(lastnametemp))
			      
		 {
			 lastname=lastnametemp;
			 run=false;
		 }
		 else { 
			 System.out.println("Re-Enter your lastname");
			 run= true;
		 }
		 
		 }
		 run=true;
		
		
		
		
			 Random rand = new Random(); 
			 int rand_int1 = rand.nextInt(1000);
			 String str=firstname.substring(0,2);
			 String substr=lastname.substring(1,4);
			 id=str+rand_int1+substr;
			  
		// if(v.validateid(idtemp))
		// {
		//	 id=idtemp;
		//	 run=false;
		// }
	//	 else { 
		//	 System.out.println("Re- enter your  id not matching");
		//	 run=true;
		// }
		//}
		run=true;
		System.out.println("Enter you Email");
		String mail;
		
		 while(run) {
			  mailtemp =sc.next();
			
			 if(v.validatemail(mailtemp))
				      
			 {
				 mail=mailtemp;
				 run=false;
			 }
			 else { 
				 System.out.println("Re-Enter your mail id");
				 run= true;
			 }
			 
			 }
		 
		   run=true;
		   System.out.println(" Enter your Password ");
		   
		 String	password;
		 while(run)
		 {
			 passwordtemp=sc.next();
			 
			 if(v.validatepass(passwordtemp))
			      
			 {
				 password=passwordtemp;
				 run=false;
			 }
			 else { 
				 System.out.println("Re-Enter your password id");
				 run= true;
			 }
			 
			 }
		 Data d=new Data(firstnametemp,lastnametemp,id,mailtemp,passwordtemp);
		 DbFunctions db=new DbFunctions();
		 db.addInFile(d);


	 }
}
