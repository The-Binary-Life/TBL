public class ShiftOperators {
    public static void main(String[] args) {
        //signed left shift
        int operand = 1;
        // 00000000 00000000 00000000 00000001 = 1
        // 00000000 00000000 00000000 00001000 = 8
        System.out.println(operand << 3);

        //signed right shift of +ve number
        operand = 128;
        // 00000000 00000000 00000000 10000000 = 128
        // 00000000 00000000 00000000 00100000 = 32
        System.out.println(operand >> 2);

        //Signed right shift of -ve number
        operand = -16;
        // 00000000 00000000 00000000 00010000      16
        // 11111111 11111111 11111111 11110000      2's complement of 16
        // 11111111 11111111 11111111 11111100      signed right shift
        // 10000000 00000000 00000000 00000100      2's complement of the right shift result = -4 (2's complement is needed as LSB is set)
        System.out.println(operand >> 2);

        //Unsigned right shift of -ve number
        // 00000000 00000000 00000000 00010000      16
        // 11111111 11111111 11111111 11110000      2's complement of 16
        // 00111111 11111111 11111111 11111100      unsigned right shift result = 1073741820 (2's complement is not needed as LSB is unset)
        System.out.println(operand >>> 2);
    }
}