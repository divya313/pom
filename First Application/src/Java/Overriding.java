package Java;

  class OverridingDemo {
	 void front() {
		 System.out.println("parent class");
	 }

}
	 class Overriding1 extends OverridingDemo {
		void front() {
			System.out.println("child class");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingDemo rn=new OverridingDemo();
		rn.front();
	}
}
