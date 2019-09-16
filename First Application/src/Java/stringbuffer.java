package Java;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sd=new StringBuffer("hello divya");
		System.out.println(sd);
		System.out.println(sd.length());
		System.out.println(sd.append("latha"));
		System.out.println(sd.delete(0, 3));
		System.out.println(sd.deleteCharAt(2));
		System.out.println(sd.substring(2));
		System.out.println(sd.substring(2,5));
		System.out.println(sd.insert(5, "latha"));
		System.out.println(sd.replace(0, 4, "welcome"));
		System.out.println(sd.reverse());

	}

}
