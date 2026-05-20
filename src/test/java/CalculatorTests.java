import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests
{
    @Test
    public void test1AddTwoNumbers()
    {
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(10, myCalculator.sumOfTwoNumbers(4,6),0.00);
    }

    @Test
    public void test2AddTwoNumbers()
    {
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(20, myCalculator.sumOfTwoNumbers(14,6),0.00);
    }

    @Test
    public void test1SubtractTwoNumbers()
    {
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(2, myCalculator.differenceOfTwoNumbers(6,4),0.00);
    }

    @Test
    public void test2SubtractTwoNumbers()
    {
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(8, myCalculator.differenceOfTwoNumbers(14,6),0.00);
    }

}
