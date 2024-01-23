package org.tbl;

import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {

        //Structure of a for loop
        //for(init; decision; control update condition){
        // your logic goes here
        // }

        //Infinite loop
        //for ( ; ; ){
        // your statements here
        //}

        for (int i = 1; i < 10; i = i + 1) {
            System.out.println("Value of i: " + i);
        }

        //The above statement can be rewritten in the following way as the code block contains
        //only a single statement
        for(int i = 1; i < 10; i = i + 1)
            System.out.println("Value of i: " + i);

        //Printing out the following pattern with the help of nested for each loop

        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *

        for (int i = 1; i <= 5; i = i + 1) {
            for (int j = 1; j <= 5; j = j + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Iterating over an array of strings using for each loop

        String[] beverageBrands = {
                "Pepsi",
                "Mirinda",
                "Coka cola",
                "7up",
                "Sprite"
        };


        for (String brand : beverageBrands) {
            System.out.println(brand);
        }

        //Iterating over a collection of custom class objects using for each loop

        List<Shape> shapeList = List.of(new Shape("square", 4),
                new Shape("triangle", 3));

        for (Shape shape : shapeList) {
            System.out.println("name: " + shape.name);
            System.out.println("sides: " + shape.sides);
        }

    }

    //Definition of the inner class Shape, we are able to access the private members
    //as this is an inner class, otherwise we will need getters for the same
    private static class Shape {
        //data member 1
        private String name;
        //data member 2
        private Integer sides;

        //argumented constructor
        Shape(String name, int sides) {
            this.name = name;
            this.sides = sides;
        }
    }
}
