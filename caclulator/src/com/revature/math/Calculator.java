package com.revature.math;

public class Calculator {
    private int a;
    private int b;
    private char operation;
    
    public int sum() {
        return a + b;
    }
    
    public int diff() {
        return a - b;
    }
    
    public int mul() {
        return a * b;
    }
    
    public double div() {
        //double db = b;
        //double da = a;
        //return da / db;
        return a / (double) b;
    }
    
    public Calculator () { super(); } // super is calling the constructor of the parent class which in this case is the capital O object class
    
    public Calculator(int a, int b, char operation) { 
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    
    public void calculate() {
        switch(operation) {
            case '+': System.out.println( sum() ); break;
            case '-': System.out.println( diff() ); break;
            case 'x': System.out.println( mul() ); break;
            case '/': System.out.println( div() ); break;
        }
    }
}
