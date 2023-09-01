package od.testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MathOperationTest {

  /**
 * Suma dos flotantes positivos 
 */
@Test
  public void addTest() {
    assertEquals(MathOperation.add(23, 5), 28);
  }
@Test
  public void multiplyTest() {
    assertEquals(MathOperation.multiply(3, 5), 15);
  }
}
