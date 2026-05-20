package calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Calculator
{
    CalculatorMethods myCalculatorMethods = new CalculatorMethods();

    // http://localhost:8080/
    @RequestMapping("/")
    String testMethod() {
        return myCalculatorMethods.testMethod();
    } // End of testMethod method

    // http://localhost:8080/addtwonumbers?numberOne=10&numberTwo=20
    @RequestMapping("/addtwonumbers")
    // localhost:8080/addtwonumbers?numberOne=10&numberTwo=20
    public double sumOfTwoNumbers(@RequestParam("numberOne") double numberOne,
                                  @RequestParam("numberTwo")  double numberTwo)
    {
        return myCalculatorMethods.sumOfTwoNumbers(numberOne, numberTwo);
    } // End of sumOfTwoNumbers method

    // http://localhost:8080/subtracttwonumbers?numberOne=10&numberTwo=20
    @RequestMapping("/subtracttwonumbers")
    // localhost:8080/addtwonumbers?numberOne=10&numberTwo=20
    public double differenceOfTwoNumbers(@RequestParam("numberOne") double numberOne, @RequestParam("numberTwo")  double numberTwo)
    {
        return myCalculatorMethods.differenceOfTwoNumbers(numberOne, numberTwo);
    } // End of differenceOfTwoNumbers method

    // http://localhost:8080/multiplytwonumbers?numberOne=10&numberTwo=20
    @RequestMapping ("/multiplytwonumbers")
    public double multiplyTwoNumbers(@RequestParam("numberOne") double numberOne,
                                     @RequestParam("numberTwo")  double numberTwo)
    {
        return myCalculatorMethods.multiplyTwoNumbers(numberOne, numberTwo);
    } // End of multiplyTwoNumbers method

    // http://localhost:8080/dividetwonumbers?numberOne=10&numberTwo=20
    @RequestMapping ("/dividetwonumbers")
    public double divideTwoNumbers(@RequestParam("numberOne") double numberOne,
                                   @RequestParam("numberTwo")  double numberTwo)
    {
        return myCalculatorMethods.divideTwoNumbers(numberOne, numberTwo);
    } // End of divideTwoNumbers method

    // http://localhost:8080/square?number=10
    @RequestMapping ("/square")
    public double square(@RequestParam("number") double number)
    {
        return myCalculatorMethods.square(number);
    } // End of square method

    // http://localhost:8080/cube?number=10
    @RequestMapping ("/cube")
    public double cube(@RequestParam("number") double number)
    {
        return myCalculatorMethods.cube(number);
    } // End of cube method

    // localhost:8080/calculatevat?amount=100
    @RequestMapping ("/calculatevat")
    public double calculateVAT(@RequestParam("amount") double amount)
    {
        return myCalculatorMethods.calculateVAT(amount);
    } // End of calculateVAT method

    // localhost:8080/calculatenett?amount=120
    @RequestMapping ("/calculatenett")
    public double calculateNett(@RequestParam("amount") double amount)
    {
        return myCalculatorMethods.calculateNett(amount);
    } // End of calculateNett method

} // End of Calculator class