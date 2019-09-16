package Java;

public class constructor1 {
	int rollno;
	String name;
	double percent;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor1 student=new constructor1( 20, "divya");
		constructor1 student1=new constructor1( 95.5);
		constructor1 student2=new constructor1(67,"latha", 96.7);
		
	}
	constructor1(double z){
		percent=z;
		System.out.println(percent);
	}
	constructor1(int x,String y,double z){
		rollno=x;
		name=y;
		percent=z;
		System.out.println(name+""  +rollno  +percent);
	}
	
	constructor1(int x,String y){
		rollno=x;
		name=y;
		System.out.println(name+ ""   +rollno);
	}

}
