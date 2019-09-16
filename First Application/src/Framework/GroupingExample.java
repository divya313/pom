package Framework;

import org.testng.annotations.Test;

public class GroupingExample {
  @Test(groups= {"apple"})
  public void apple() {
	  System.out.println("apple");
  }
  @Test(groups= {"apple"})
  public void apple1() {
	  System.out.println("apple1");
  }
  @Test(groups= {"banana"})
  public void banana() {
	  System.out.println("banana");
  }
  @Test(groups= {"banana"})
  public void banana1() {
	  System.out.println("banana1");
  }
  @Test(groups= {"grapes"})
  public void grapes() {
	  System.out.println("grapes");
  }
  @Test(groups= {"grapes"})
  public void grapes1() {
	  System.out.println("grapes1");
  }
  
}
