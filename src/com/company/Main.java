package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void computations(String[] input){
        List<String> stack = new ArrayList();
        float f = 0;
        for(int i = 0; i < input.length; i++ ){
            switch(input[i]){
                case "+":
                        f = Float.parseFloat(stack.get(0)) + Float.parseFloat(stack.get(1));
                        stack.remove(1);
                        stack.set(0,String.valueOf(f));

                        break;

                case "-":
                    f = Float.parseFloat(stack.get(0)) - Float.parseFloat(stack.get(1));
                    System.out.println(f);
                    stack.remove(1);
                    stack.set(0,String.valueOf(f));
                    break;

                case "/":
                    f = Float.parseFloat(stack.get(0)) / Float.parseFloat(stack.get(1));
                    System.out.println(f);
                    stack.remove(1);
                    stack.set(0,String.valueOf(f));
                    break;

                case "*":
                    f = Float.parseFloat(stack.get(0)) * Float.parseFloat(stack.get(1));
                    System.out.println(f);
                    stack.remove(1);
                    stack.set(0,String.valueOf(f));
                    break;

                default:
                    stack.add(input[i]);
                    break;



            }

        }
        System.out.println(stack.get(0));

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput="";
        System.out.println("Enter numbers and operators, seperated by commas: \n");
        userInput = scanner.nextLine();

        String [] input = userInput.split(",");


        computations(input);



    }
}
