package Framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
  @Test
  @Parameters("name")
  public void printname(String name) {
	  System.out.println("name is"+name);
  }
}
