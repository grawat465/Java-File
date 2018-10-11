import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br;
		 br=new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter your id");
		 int i=br.read();
		 
		//br.read();
		br.readLine(); 
		 System.out.println("Enter your name");
		// br.read(); 
		String str= br.readLine();
		
		 System.out.println("Enter your fname");
		// br.read(); 
		String fstr= br.readLine();
		
		System.out.println("Enter your salary");
		
	    double sal=Double.parseDouble(br.readLine());
	    
	    System.out.println("id" + i +" "+ "name"+ str+ " "+ sal);
		
		 
	}

}
