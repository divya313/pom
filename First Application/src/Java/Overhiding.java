package Java;

 class Overhiding {
	 void print() {
		 System.out.println("method from parent");
	 }
 }
 class Overhiding1 extends Overhiding{
	 void print() {
		 System.out.println("method from child class");
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overhiding x = new Overhiding();
		x.print();

	}

}
