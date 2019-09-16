package Framework;

import org.testng.annotations.Test;

public class DependenciesExample {
  @Test(enabled=true)
  public void highschool() {
	  System.out.println("highschool");
  }
	/*
	 * @Test(dependsOnMethods="highschool") 
	 * public void college() {
	 * System.out.println("college"); }
	 * 
	 * @Test(dependsOnMethods="college") 
	 * public void degree() {
	 * System.out.println("degree"); }
	 */
}
