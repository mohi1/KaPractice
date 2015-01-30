package hum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class myJUnit1 {
	@BeforeClass
	public void beforeEveryTestRun(){
		System.out.println("Runs before every Test RUN");
		System.out.println("@@@@@@@@@");
	}
	@Before
	public void beforeEveryTest(){
		//System.out.println("Runs before each @Test method");
		System.out.println("--------------");
	}
	//Gets executed every time we run the JUnit program
	@Test
	public void test1(){
		if (mMultiply(10,30)==300){
			System.out.println("Multiply Pass");
		} else{
			System.out.println("Multiply Fail");
			fail("Multiply failed for 10 and 30");
		}
	}
	//Can create multiple Tests to run
	//Method name must have a word Test somewhere.
	@Test
	public void test2(){
		if(mAdd(10,30)==300) {
			System.out.println("Add Pass");
		}else{
			System.out.println("Add Fail");
			fail("")
		}
		@Test
		public void test1(){
			
			//Multiply
			public int mMultiply(int x, int y){
				return x*y;
			}
			//Add
			public int mAdd(int x, int y){
				return x+y;
				//Divide
				public double mDivide(int x, int y){
					return x/y;
				}
			}
			
		}
	}
	private int mAdd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
