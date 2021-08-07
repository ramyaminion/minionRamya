package com.markLearningProjects.calculatorProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Scanner inbuilt class object declaration
        Calculator cal = new Calculator(); //calculator class object declaration
        System.out.println("Enter you First value : ");
        int x = sc.nextInt(); //Using scanner's object I am calling a method inside it's class
        System.out.println("Enter you Second value : ");
        int y = sc.nextInt();
        int add = cal.addOperation(x,y);
        int mul = cal.mulOperation(x,y);
        int div = cal.divOperation(x,y);
        int sub = cal.subOperation(x,y);
        int mod = cal.modOperation(x,y);
        System.out.println("Your resultant value for "+x+" & "+y+" = "+add);
        System.out.println("Your resultant value for "+x+" & "+y+" = "+mul);
        System.out.println("Your resultant value for "+x+" & "+y+" = "+sub);
        System.out.println("Your resultant value for "+x+" & "+y+" = "+mod);
        System.out.println("Your resultant value for "+x+" & "+y+" = "+div);
    }
}
