import CalculatorClasess.Adder;
import CalculatorClasess.CalculatorException;
import CalculatorClasess.CalculatorInterface;
import CalculatorClasess.CalculatorProcess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void resultadoSumaTest() throws CalculatorException {
        CalculatorProcess adder = new Adder();
        double result = adder.doCalculate("add 1.0 2.0");
        Assertions.assertEquals(3.0,adder.getResult());
    }
}
