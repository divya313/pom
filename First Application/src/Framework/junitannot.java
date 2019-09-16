package Framework;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junitannot {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AferClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test() {
		System.out.println("test01");
	}
	@Test
	public void test1() {
		System.out.println("test02");
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("test03");
	}
	@Test
	@Ignore("bug is not fixed  yet")
	public void test3() {
		System.out.println("Test04");
	}
	@Test (expected = NoSuchElementException.class)
	public void test4() {
		System.out.println("Test05");
		throw(new NoSuchElementException());
	}
	@Test(timeout=100)
	public void test_06() throws InterruptedException {
		Thread.sleep(90);
		System.out.println("Test_06");
	}

}
