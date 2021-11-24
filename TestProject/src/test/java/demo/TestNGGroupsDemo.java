package demo;

import org.testng.annotations.Test;

@Test(groups = "all class tests")
public class TestNGGroupsDemo {
	
	@Test(groups = {"sanity"})
	public void one() {
		System.out.println(" I am inside test 1");
	}
	
	@Test(groups = {"windows.regression"})
	public void two() {
		System.out.println(" I am inside test 2");
	}
	@Test(groups = {"linux.regression"})
	public void three() {
		System.out.println(" I am inside test 3");
	}
	@Test
	public void four() {
		System.out.println(" I am inside test 4");
	}

}
