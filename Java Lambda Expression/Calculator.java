public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void calculate(ICalculator iCalculator){
        iCalculator.Calculate(this.a, this.b);
    }
}
