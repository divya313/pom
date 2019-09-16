package Java;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the roll no: ");
		int rollno=obj.nextInt();
		System.out.println("Enter the name:");
		String name=obj.next();
		System.out.println("enter the fees:");
		double fee=obj.nextDouble();
		System.out.println("roll no :"+rollno+ "name:"+name+ "fees:"+fee );
		obj.close();
		
		
	}

}
