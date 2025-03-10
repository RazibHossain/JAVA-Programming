import interfaces.ICalculator;
import models.Subtruction;

public class Driver {

    public static void main(String[] args) {

//        Way 1- Normal Process
//        Interface a arekta class baniye implements kore tar vitor method override kora
        //        Subtruction sub = new Subtruction();
        //        Integer y = sub.calculate(10,5);

//        Way 2 _ Inside Class Override method
//        ICalculator additionCalculator = new ICalculator() {
//            @Override
//            public Integer calculate(int a, int b) {
//                return a+b;
//            }
//        };
//        Integer x = additionCalculator.calculate(5,6);
//        System.out.println(x);

//        Way 3 - LambdaExpression
        ICalculator addition = (a, b) -> { return a + b; };
        ICalculator subtraction = (a, b) -> { return b - a; };
        
        Integer addResult = addition.calculate(5, 10);
        Integer subResult = subtraction.calculate(5, 10);

//        Way 4 - Same as Lamdbd with another method (Optional)

//        printResult((a,b)->{return a+b;},10,5);
//
//    }
//
//    public static void printResult(ICalculator calculator,Integer a, Integer b){
//
//        System.out.println("Result: "+ calculator.calculate(a,b));

//        Wau 5 - Same as 4 + some modify

//        ICalculator add = ((a, b) -> { return a + b;});
//        ICalculator sub = ((a, b) -> { return b - a; });
//        ICalculator mul = ((a, b) -> { return a * b; });
//
//        printResult(add,10,5);
//
//    }
//
//    public static void printResult(ICalculator calculator, Integer a, Integer b) {
//
//        System.out.println("Result: " + calculator.calculate(a, b));
    }
}