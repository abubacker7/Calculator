package com.learn;

import java.util.Scanner;

public class CalculatorLoader {
    private char operator;
    private long num1;
    private long num2;

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }

    public void getCalculator() {
        var input = new Scanner( System.in );
        System.out.println( "Please Enter operator to perform calculation ( +, -, * or / )" );
        this.setOperator( input.next().charAt(0) );
        if ( '/' == this.getOperator() ) {
            System.out.println( "Enter Number to Divide" );
        } else {
            System.out.println( "Enter First Number" );
        }
        this.setNum1( input.nextLong() );
        if ( '/' == this.getOperator() ) {
            System.out.println( "Enter Number to Divided by" );
        } else {
            System.out.println( "Enter Second Number" );
        }
        this.setNum2( input.nextLong() );
        input.close();

        long result;

        switch ( this.getOperator() ) {
            case '+':
                result = this.getNum1() + this.getNum2();
                System.out.println( "Addition of " + this.getNum1() + " and " + this.getNum2() + " is equal to: " + result );
                break;
            case '-':
                result = this.getNum1() - this.getNum2();
                System.out.println( "Substraction of " + this.getNum1() + " and " + this.getNum2() + " is equal to: " + result );
                break;
            case '*':
                result = this.getNum1() * this.getNum2();
                System.out.println( "Multiplication of " + this.getNum1() + " and " + this.getNum2() + " is equal to: " + result );
                break;
            case '/':
                try {
                    result = this.getNum1() / this.getNum2();
                    System.out.println( "Division of " + this.getNum1() + " by " + this.getNum2() + " is equal to: " + result );
                } catch( ArithmeticException e ) {
                    System.out.println( "Number you've entered cannot be 0 " + e );
                }
                break;
            default:
                System.out.println( "Please Enter valid listed operator" );
        }
    }
}
