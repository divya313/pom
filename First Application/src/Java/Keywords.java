package Java;

public class Keywords {
	int x=10;
}
 class Keywords1 extends Keywords{
	int x=20;
	void display() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywords1 ad=new Keywords1();
		ad.display();
	}

	}
