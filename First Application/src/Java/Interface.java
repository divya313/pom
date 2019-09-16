package Java;

interface  Interface {
	int z=30;
	void m1();
	
	interface  Interface1 extends Interface{
		 public static final int x=35;
		void m2();
	
	
	public class interfacedemo implements Interface1{
		public void m1() {
			System.out.println("welcome");
		}
		public void m2() {
			System.out.println("divya");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacedemo ad=new interfacedemo();
		ad.m1();
		System.out.println(z);
		ad.m2();
		
		System.out.println(x);
		
	}

}
}
