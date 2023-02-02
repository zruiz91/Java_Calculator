/*
This is a basic calculator that operates on whole numbers.
*/

public class Calculator{
    public Calculator(){

    }

  //add method that returns an int
    public int add(int a, int b){
        int result = a + b;
        return result;
    }

  //subtract method that returns an int
    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }

  //multiply method that rturns an int
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }

  //divide method that rturns an int
    public int divide(int a, int b){
        int result = a / b;
        return result;
    }

  //modulo method that rturns an int
    public int modulo(int a, int b){
        int result = a % b;
        return result;
    }

    //add method that rturns a double
    public double addDouble(double a, double b){
        double result = a + b;
        return result;
    }

    //subtract method that returns a double
    public double subtractDouble(double a, double b){
        double result = a - b;
        return result;
    }

  //multiply method that rturns a double
    public double multiplyDouble(double a, double b){
        double result = a * b;
        return result;
    }

  //divide method that rturns a double
    public double divideDouble(double a, double b){
        double result = a / b;
        return result;
    }

  //modulo method that rturns a double
    public double moduloDouble(double a, double b){
        double result = a % b;
        return result;
    }
    public static void main(String[] args){

        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
    }

}