/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SonarTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    
    
    Calculation obj = new Calculation();
	
	@Test
	public void testAddition() {
		assertEquals(4, obj.addition(2,2));
	}
}
