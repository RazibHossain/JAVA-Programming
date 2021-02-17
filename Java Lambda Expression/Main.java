public class Main {
    public static void main(String []args){

        Calculator calculator = new Calculator(10, 5);

        calculator.calculate((a, b)->{
            System.out.println(a + b);
        });

        calculator.calculate((a, b)->{
            System.out.println(a - b);
        });

        calculator.calculate((a, b)->{
            System.out.println(a * b);
        });

        calculator.calculate((a, b)->{
            System.out.println(a / b);
        });





    }


    public void sum(int a, int b){
        System.out.println(a + b);
    }
}
