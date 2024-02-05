public class calculator {
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    /**
     * The function subtracts two float numbers and returns the result.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return The difference between num1 and num2 is being returned.
     */
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public float divide(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();

        float resultAdd = calculator.add(5.5f, 3.2f);
        System.out.println("Addition: " + resultAdd);

        float resultSubtract = calculator.subtract(8.0f, 3.5f);
        System.out.println("Subtraction: " + resultSubtract);

        float resultMultiply = calculator.multiply(4.2f, 6.3f);
        System.out.println("Multiplication: " + resultMultiply);

        float resultDivide = calculator.divide(10.0f, 2.0f);
        System.out.println("Division: " + resultDivide);

        float resultDivideByZero = calculator.divide(5.0f, 0.0f);
        System.out.println("Division by Zero: " + resultDivideByZero);
    }
}
