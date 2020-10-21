import java.util.Scanner;

public class customer {
	
	private int customerID;
	private String email;
	private String password;
	private String name;
	
	Scanner sc= new Scanner(System.in);
	
	void setdata() 
	{
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your ID: ");
		customerID =sc.nextInt();
		System.out.println("Enter your password: ");
		password =sc.next();
		System.out.println("Enter your email address: ");
		email =sc.next();
	}
	
	
	void showdata()
	{
		System.out.println("Name: "+name+"/n"+"Customer ID: "+customerID+"/n"+"Email address:  "+email+"/n"+"Password: "+password);
	}

	
	public static void main (String[] Args)
	{
		customer c1= new customer();
		c1.setdata();
		c1.showdata();
	}
	
		
}
