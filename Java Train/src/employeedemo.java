
import java.util.Scanner;

public class employeedemo {
	
	public static void main(String [] args) {
		PermanentEmployee r=new PermanentEmployee(2,"Bhanu", 45000,7);
		r.display();
		r.display1();
		example emp[];
		emp=new example[4];
	    for(int i=0;i<emp.length;i++)
	    {
	    	
	    	
	    	Scanner sc;
    		System.out.println("Enter the id of employee");
    		sc=new Scanner(System.in);
    		int x=sc.nextInt();
    		//System.out.println(x);

    		System.out.println("Enter the name of employee");
    		String y=sc.next();
    	//	System.out.println(y);


    		System.out.println("Enter the Salary of employee");
    		double z=sc.nextDouble();
    		//System.out.println(z);
    		
    		emp[i]=new example(x,y,z);
	    	
	    	
	    }
	    example temp;
	 
	    	
	    
	    		
	    		for(int i=0;i<emp.length;i++)
	    		{
	    			for(int j=i;j<emp.length;j++)
	    			{
	    				if(emp[j].getSalary()>emp[i].getSalary())
	    				{
	    					temp=emp[j];
	    					emp[j]=emp[i];
	    					emp[i]=temp;
	    					
	    					
	    				}
	    			
	    
	    	}


	}
	    		
for(int i=0;i<emp.length;i++)
{
	System.out.println("Element at" + i + ":"+ emp[i].getEmpid() + ":"+ emp[i].getEmpname()+":"+emp[i].getSalary() );
}

}
}

     