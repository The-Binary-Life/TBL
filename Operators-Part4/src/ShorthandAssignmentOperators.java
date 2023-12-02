public class ShorthandAssignmentOperators {
    public ShorthandAssignmentOperators() {
    }

    public static void main(String[] args) {
        int operandA = 10;
        int operandB = 5;
        System.out.println("10 + 5 = " + (operandA + operandB));
        operandB += operandA;
        System.out.println("10 + 5 = " + operandB);
        operandB = 5;
        System.out.println("10 - 5 = " + (operandA - operandB));
        operandA -= operandB;
        System.out.println("10 - 5 = " + operandA);
        operandA = 10;
        System.out.println("10 x 5 = " + operandA * operandB);
        operandA *= operandB;
        System.out.println("10 x 5 = " + operandA);
        operandA = 10;
        System.out.println("10 / 5 = " + operandA / operandB);
        operandA /= operandB;
        System.out.println("10 / 5 = " + operandA);
        operandA = 10;
        System.out.println("10 % 5 = " + operandA % operandB);
        operandA %= operandB;
        System.out.println("10 % 5 = " + operandA);
    }
}
