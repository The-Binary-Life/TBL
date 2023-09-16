public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 15; // 00001111
        int b = 12; // 00001100

        //Bitwise AND
        int res1 = a & b;
        System.out.println(res1);

        //Bitwise OR
        int res2 = a | b;
        System.out.println(res2);

        //Bitwise XOR
        int res3 = a ^ b;
        System.out.println(res3);

        //Bitwise complement
        int res4 = ~a;
        System.out.println(res4);
    }
}