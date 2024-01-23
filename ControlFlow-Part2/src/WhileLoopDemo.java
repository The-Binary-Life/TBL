import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int numberOne = 50;

        System.out.println("The value of number = " + numberOne);

        numberOne = numberOne + 2;

        System.out.println("The value of number = " + numberOne);

        numberOne = numberOne + 2;
        System.out.println("The value of number = " + numberOne);

        //while(condition){
        // statements that needs execution
        // update condition logic as well
        //}

        System.out.println("While output");
        int numberTwo = 50;
        while(numberTwo < 55){
            System.out.println("The value of number = " + numberTwo);
            numberTwo = numberTwo + 2;
        }

        //do {
        // statements...
        // update condition for loop control
        //} (condition expr);

        System.out.println("Do while output");

        numberTwo = 50;
        do {
            System.out.println("The value of number = " + numberTwo);
            numberTwo = numberTwo + 2;
        }while(numberTwo < 55);

        System.out.println("Do while example using console input");

        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Please select your preferred beverage");
            System.out.println("1 -> Tea");
            System.out.println("2 -> Coffee");
            System.out.println("Please enter your choice(1/2) : ");
            userInput = scanner.nextInt();
            if(userInput != 1 && userInput != 2){
                System.out.println("Invalid choice. Please enter correct choice");
            }else {
                System.out.println("Thank you! Enjoy your beverage");
            }
        }while(userInput != 1 && userInput !=2);

        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
         */
        int i = 1;
        while(i <= 5){
            int j = 1;
            do {
                System.out.print("* ");
                j = j + 1;
            }while(j <= 5);
            System.out.println();
            i = i + 1;
        }

        System.out.println("While do-while star printing");
        i = 1;
        do {
            int j = 1;
            while( j <= 5){
                System.out.print("* ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }while (i <= 5);

        i = 0;
        do
            System.out.println("This is without braces");
        while(++i < 2);

        i = 0;
        while(i++ < 2)
            System.out.println("This is also without braces");

    }
}
