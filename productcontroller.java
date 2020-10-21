import java.util.Scanner;

public class productcontroller {

		private int productID;
		private String productName;
		private int price;
		
		Scanner sc=new Scanner (System.in);
		
		void createproduct()
		{
			System.out.println("Enter Product details: ");
			System.out.println("Product name: ");
			productName= sc.next();
			System.out.println("Product ID: ");
			productID =sc.nextInt();
			System.out.println("Price of the Product: ");
			price=sc.nextInt();
			
		}
		
		void updateproduct()
		{
			
		}
		
		void removeproduct()
		{
			
		}
		
		
}
		