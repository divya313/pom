package Java;

class ParentClass_S1{
	void display1()
	{
		System.out.println("ParentClass_S1");
	}
}
class ParentClass_S2 extends ParentClass_S1
{
	void display2()
	{
		System.out.println("ParentClass_S2");
	}
}
public class ChildClass_ML extends ParentClass_S2
{

	public static void main(String[] args) {
		ChildClass_ML obj=new ChildClass_ML();
		obj.display1();
		obj.display2();
	}

}


