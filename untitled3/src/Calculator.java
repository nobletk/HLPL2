public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static double divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("cant divide by zero");
        }
        return a*1.0/b;
    }
}
