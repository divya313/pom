package Java;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("hello divya");//object method//
		String s2="divya";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());//length of string//
		System.out.println(s2.length());
		System.out.println(s1.charAt(1));//char at string//
		System.out.println(s2.charAt(2));
		System.out.println(s1.concat(s2));//print two strings//
		System.out.println(s2.concat(s1));
		System.out.println(s1.equals(s2));//equals case//
		System.out.println(s2.equalsIgnoreCase(s1));
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf(""));
	}

}
