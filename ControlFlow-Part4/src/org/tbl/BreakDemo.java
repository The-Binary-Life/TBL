package org.tbl;

public class BreakDemo {
    public static void main(String[] args) {
        //Points to keep in mind:
        // 1. break works in a switch and loop constructs such as for, while and do-while only
        // 2. break takes the program control to the immediate parent block of the currently executing block
        // 3. labelled break can take the program control from an executing block to any enclosing parent loop or switch block
        //    or outside of it

        //break in a switch statement demo
        String driver = "Val1";

        System.out.println("Example1");

        switch(driver){
            case "Val1": {
                System.out.println("We have found the value we are looking for, now breaking out of the switch");
                break;
            }
            case "Val2": {
                label1:
                System.out.println("This will not execute");
            }
            default: {
                System.out.println("This is also not going to be printed");
            }
        }
        System.out.println("Control will come here after break in the switch statement");

        System.out.println("Example2");

        //nested switch with labelled break
        label1:
        switch("val2"){
            case "val1": {
                System.out.println("This will not execute");
            }
            case "val2": {
                label2:
                switch("val3"){
                    case "valx": {
                        System.out.println("This will not execute");
                    }
                    case "val3": {
                        System.out.println("This will execute");
                        break label2;
                    }
                }
            }
            default:
                System.out.println("This will be printed");
        }

        System.out.println("Example3");

        //break in a for loop
        for(int i = 1; i < 20; i++){
            if(i == 10)
                break;
            System.out.println("FOR: This will get printed until i == 10, current value of i = " + i);
        }

        System.out.println("Example4");

        //break in a while loop
        int i = 1;
        while(i < 20){
            if(i == 10)
                break;
            System.out.println("WHILE: This will get printed until i == 10, current value of i = " + i);
            i++;
        }

        System.out.println("Example5");

        //break in a do-while loop
        i = 1;
        do {
            if(i == 10)
                break;
            System.out.println("DO-WHILE: This will get printed until i == 10, current value of i = " + i);
        }while(i++ < 20);

        System.out.println("Example6");

        //breaking in a nested loop
        for(i = 1; i < 20; i++){ //This loop runs once
            if(i == 2)
                break;
            for(int j = 1; j < 20; j++){ //This loop runs twice
                if(j == 3)
                    break;
                for(int k = 1; k < 20; k++){ //This loop runs thrice
                    if(k == 4)
                        break;
                    System.out.println("k-loop: i = " + i + " j = " + j + " k = " + k);
                }
                System.out.println("j-loop: i = " + i + " j = " + j);
            }
            System.out.println("i-loop: i = " + i);
        }

        System.out.println("Example7");

        loop1:
        for(i = 1; i < 20; i++){ //This loop runs once
            if(i == 2) {
                System.out.println("Breaking out of loop1");
                break loop1;
            }
            loop2:
            for(int j = 1; j < 20; j++){ //This loop runs twice
                if(j == 3) {
                    System.out.println("Breaking out of loop2");
                    break loop2;
                }
                loop3:
                for(int k = 1; k < 20; k++){ //This loop runs thrice
                    if(k == 4) {
                        System.out.println("Breaking out of loop3");
                        break loop1;
                    }
                    System.out.println("k-loop: i = " + i + " j = " + j + " k = " + k);
                }
                System.out.println("j-loop: i = " + i + " j = " + j);
            }
            System.out.println("i-loop: i = " + i);
        }
    }
}
