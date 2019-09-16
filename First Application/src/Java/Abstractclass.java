package Java;

abstract class Abstractclass {
	abstract void sound();
	void dispaly() {
		System.out.println("iam an animal");
	}
	Abstractclass(){
		System.out.println("constructor");
	}
}
	 class Animal extends Abstractclass  {
		// TODO Auto-generated method stub
		 void sound() {
			 System.out.println("barking");
		 }
	 

	
	 public static void main(String[] args) {
		 Abstractclass a=new Animal();
		 a.dispaly();
	 }

}

