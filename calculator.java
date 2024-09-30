public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.addition(5, 3));
        System.out.println("Subtraction: " + calc.subtraction(5, 3));
        System.out.println("Multiplication: " + calc.multiplication(5, 3));
        System.out.println("Division: " + calc.division(5, 3));
        System.out.println("Modulus: " + calc.modulus(5, 3));
    }

    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }

}