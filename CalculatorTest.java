import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate(1,5);
    assertEquals(6, sum);
  }
  public static void main(String[]args) {
	  CalculatorTest test = new CalculatorTest(); 
  }
}
