package Java;

public class MethodOverloading1 {
	void add(int x,int y) {
		System.out.println("result 1:" +(x+y));
	}
	void add(int x,int y,int z) {
		System.out.println("result 2:" +(x+y+z));
	}
		void add(int x,double y) {
			System.out.println("result 3:" +(x+y));
		}
			void add(double x,int y) {
				System.out.println("result 4:" +(x+ y));
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 ad=new MethodOverloading1();
		ad.add(1, 2);
		ad.add(1, 2, 3);
		ad.add(4, 4.5);
		ad.add(2.3, 5);
		
	}

}
