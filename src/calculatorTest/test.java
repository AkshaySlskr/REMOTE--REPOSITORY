package calculatorTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.calculator;
 
public class test {
	
	@Test
	public void caltestadd() {
	assertEquals(40,calculator.add(20,20));
	}
	@Test
	public void caltestsub() {
	assertEquals(3,calculator.sub(6,3 ));
	}
	@Test
	public void caladdmul() {
	assertEquals(400,calculator.mul(20,20));
	}
	@Test
	public void caltestdiv() {
	assertEquals(1,calculator.div(20,20));
  }	
}


