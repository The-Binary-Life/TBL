public class ShiftOperators {
    public ShiftOperators() {
    }

    public static void main(String[] args) {
        int operand = 1;
        System.out.println(operand << 3);
        operand = 128;
        System.out.println(operand >> 2);
        operand = -16;
        System.out.println(operand >> 2);
        operand = -16;
        System.out.println(operand >>> 2);
    }
}