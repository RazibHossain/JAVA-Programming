import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Driver driver=new Driver();
        int x=20;
        int y=10;


        //Operation
        Calculator sum=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;
        Calculator mul=(a,b)->a*b;
        Calculator div=(a,b)->a/b;


        System.out.println(driver.operation(x,y,mul));
        Greetings greetings=(s)->System.out.println("Hello "+s);
        greetings.print("Razib");


    }

//    public static void print(Calculator calculator,int a,int b){
//        System.out.println(calculator.calculate(a,b));
//    }

    private int operation(int a, int b, Calculator calculator) {
        return calculator.calculate(a, b);
    }



}
