package calculator;

public class CalculatorMethods
{

    String testMethod() {
        return "Hello World!";
    } // End of testMethod method


    public double sumOfTwoNumbers(double numberOne, double numberTwo)
    {
        return numberOne + numberTwo;
    } // End of sumOfTwoNumbers method


    public double differenceOfTwoNumbers(double numberOne, double numberTwo)
    {
        return numberOne - numberTwo;
    } // End of differenceOfTwoNumbers method

    public double multiplyTwoNumbers(double numberOne, double numberTwo)
    {
        return numberOne * numberTwo;
    } // End of multiplyTwoNumbers method


    public double divideTwoNumbers(double numberOne, double numberTwo)
    {
        return numberOne / numberTwo;
    } // End of divideTwoNumbers method


    public double square(double number)
    {
        return number * number;
    } // End of square method


    public double cube(double number)
    {
        return number * number * number;
    } // End of cube method


    public double calculateVAT(double amount)
    {
        return amount * 0.2;
    } // End of calculateVAT method


    public double calculateNett(double amount)
    {
        return amount / 1.2;
    } // End of calculateNett method

} // End of CalculatorMethods class