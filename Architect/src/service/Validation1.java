package service;
import module.Data;
import module.Employee;

import java.util.regex.Pattern;

public class Validation1 {
	Data signup=new Data();
	Employee emp=new Employee();
	
	
	//Data signup=new Data();
	public boolean validateFirstName(String a) {
		
		if(Pattern.matches("[A-Za-z]{3,10}",a))
		{
			return true;
		}
		else return false;
	}
	
		
		//Data signup=new Data();
		public boolean validateLastName(String a) {
			
			if(Pattern.matches("[A-Za-z]{3,10}",a))
			{
				return true;
			}
			else return false;
		
		
	}
		
		//Data signup=new Data();
			//	public boolean validateid(int  a) {
					
				//	if(Pattern.matches("[0-9]{3,7}", Integer.toString(a) ) ){
				//		return true;
				//	}
				//	else return false;
				
				
		//	}
				
public boolean validatemail(String  a) {
					
					if(Pattern.matches("[A-Z a-z 0-9]{3,15}[!@#$%^&*()][A-Z a-z]{4,9}[.][a-z]{2,3}", a ) ){
						return true;
					}
					else return false;
				
				
			}
public boolean validatepass(String  a) {
	
	if(Pattern.matches("[A-Z][a-z 0-9]{3,10}[!@#$%^&*()]",a ) ){
		return true;
	}
	else return false;


}
	

public boolean validateuser(String  a) {
	
	if(Pattern.matches("[A-Z a-z 0-9]{3,15}[!@#$%^&*()][A-Z a-z]{4,9}[.][a-z]{2,3}",a ) ){
		return true;
	}
	else return false;


}

public boolean validatecpass(String  a) {
	
	if(Pattern.matches("[A-Z][a-z 0-9]{3,10}[!@#$%^&*()]",a ) ){
		return true;
	}
	else return false;
		
	}

}

	
