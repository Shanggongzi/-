package xuexi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class chengjiTest {
	@Before
	public void testbefore() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@BeforeClass
	public static void testbeforeclass() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Test
	public void testfangfa() {
		System.out.println("ff");
	}

	@Test
	public void testfangfa2() {
		System.out.println("ee");
	}

	@After
	public void testafter() {
		System.out.println("4");
	}

	@AfterClass
	public static void testafterclass() {
		System.out.println("2");
	}
}
