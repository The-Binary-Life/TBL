package org.tbl;

public class ContinueDemo {
    public static void main(String[] args) {
        //continue can only be used with loop constructs such as while, do-while and for
        //we cannot use continue with switch statement

        //break which takes you out of a code block , continue makes you skip the current iteration of the loop and jump to the next iteration
        //continue can jump to any particular current parent loop iteration using labels

        System.out.println("Example1");

        switch("val1"){
            case "val2": {
                System.out.println("This is val2 block");
            }
            case "val1": {
                System.out.println("This is val1 block");
                //continue;
            }
            default:
                System.out.println("We have reached the default block");
        }

        System.out.println("Example2");

        //using continue in a for loop
        for(int i = 1; i < 20; i++){
            if(i < 5 || i > 10)
                continue;
            System.out.println("FOR: This will print only 5 - 10 and skip the remaining iterations, current value of i = " + i);
        }

        System.out.println("Example3");

        //using continue in a while loop
        int i = 1;
        while(i++ < 20){
            if(i < 5 || i > 10)
                continue;
            System.out.println("WHILE: This will print only 5 - 10 and skip the remaining iterations, current value of i = " + i);
        }

        System.out.println("Example4");

        //using continue in a do-while loop
        i = 1;
        do {
            if(i < 5 || i > 10)
                continue;
            System.out.println("DO-WHILE: This will print only 5 - 10 and skip the remaining iterations, current value of i = " + i);
        }while(i++ < 20);

        System.out.println("Example5");

        //using continue in a nested loop
        for(i = 1; i < 20; i++){ //This loop full body executes once, rest iterations gets skipped
            if(i > 1)
                continue;
            for(int j = 1; j < 20; j++){ //This loop full body executes twice, rest iterations gets skipped
                if(j > 2)
                    continue;
                for(int k = 1; k < 20; k++){ //This loop full body executes thrice, rest iterations gets skipped
                    if(k > 3)
                        continue;
                    System.out.println("k-loop: i = " + i + " j = " + j + " k = " + k);
                }
                System.out.println("j-loop: i = " + i + " j = " + j);
            }
            System.out.println("i-loop: i = " + i);
        }

        System.out.println("Example6");

        //labelled continue in a nested loop
        loop1:
        for(i = 1; i < 20; i++){ //This loop full body executes once, rest iterations gets skipped
            if(i > 1)
                break;
            loop2:
            for(int j = 1; j < 20; j++){ //This loop full body executes twice, rest iterations gets skipped
                if(j > 2)
                    continue loop2;
                loop3:
                for(int k = 1; k < 20; k++){ //This loop full body executes thrice, rest iterations gets skipped
                    if(k > 3)
                        continue loop1;
                    System.out.println("k-loop: i = " + i + " j = " + j + " k = " + k);
                }
                //This statement is not reached due to continue
                System.out.println("j-loop: i = " + i + " j = " + j);
            }
            System.out.println("i-loop: i = " + i);
        }

        System.out.println("Example7");

        //no statement should be present between the label and the loop start
        loop1:
        //String s = "TheBinaryLife";
        for(i = 1; i < 10; i++){
            System.out.println("Some dummy string");
//            if(i > 5)
//                continue loop1;
        }
    }
}
