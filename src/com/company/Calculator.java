package com.company;

import java.util.Scanner;

public class Calculator {
    static int result;
    static int operation;
    static int scaleOfNotation;
    static Decimal number1;
    static Decimal number2;
    static int remainder;

    public static void addition(Decimal value1, Decimal value2) {
        result = value1.value + value2.value;
    } // end method

    public static void substraction(Decimal value1, Decimal value2) {
        result = value1.value - value2.value;
    } // end method

     static void multiplication(Decimal value1, Decimal value2) {
        result = value1.value * value2.value;
    } // end method

    public static void division(Decimal value1, Decimal value2) {
        result = value1.value / value2.value;
        remainder = value1.value % value2.value;
    } // end method

    public static void main(String[] args) {
        boolean bool = false;
        Scanner scan = new Scanner(System.in);
        while (bool == false) {
            System.out.println("выберите систему счисления");
            System.out.println("1: десятичная");
            System.out.println("2: двоичная");
            System.out.println("3: восьмиричная");
            System.out.println("4: шестнадцатиричная");
            scaleOfNotation = scan.nextInt();
            switch (scaleOfNotation) {
                case 1:
                    System.out.println("введите числа");
                    number1 = new Decimal(scan.nextInt());
                    System.out.println("число " + ++Decimal.count + " = " + number1.value);
                    number2 = new Decimal(scan.nextInt());
                    System.out.println("число " + ++Decimal.count + " = " + number2.value);
                    bool = true;
                    break;
                case 2:
                    System.out.println("введите числа");
                    number1 = new Binary(scan.nextInt());
                    number2 = new Binary(scan.nextInt());
                    bool = true;
                    break;
                case 3:
                    System.out.println("введите числа");
                    number1 = new Octal(scan.nextInt());
                    number2 = new Octal(scan.nextInt());
                    bool = true;
                    break;
                case 4:
                    System.out.println("введите числа");
                    number1 = new Hexademical(scan.nextInt());
                    number2 = new Hexademical(scan.nextInt());
                    bool = true;
                    break;
                default:
                    System.out.println("введнное число не верно");
            } // end switch
        } /// end while
        while (bool == true) {
            System.out.println("выберите операцию");
            System.out.println("1: сложение");
            System.out.println("2: вычитание");
            System.out.println("3: умножение");
            System.out.println("4: деление");
            operation = scan.nextInt();
            switch (operation) {
                case 1:
                    Calculator.addition(number1, number2);
                    System.out.println("ответ:= " +result);
                    bool = false;
                    break;
                case 2:
                    Calculator.substraction(number1, number2);
                    System.out.println("ответ:= " +result);
                    bool = false;
                    break;
                case 3:
                    Calculator.multiplication(number1, number2);
                    System.out.println("ответ:= " +result);
                    bool = false;
                    break;
                case 4:
                    Calculator.division(number1, number2);
                    System.out.println("ответ:= " +result + " остаток:= "+ remainder);
                    bool = false;
                    break;
                default:
                    System.out.println("введнное число не верно");
            } // end switch
        } // end while
    } // end main
} // end class

class Decimal {
    public static int count;
    public int value;

    Decimal(int value) {
        this.value = value;
    }  // end constructor

    Decimal() {
    }  // end constructor
} // end class

class Binary extends Decimal {
    public int value;

    Binary(int value) {
        super(value);
        System.out.println("Вы ввели "+Integer.toBinaryString(value));
        this.value = value;
        System.out.println("число " + ++count + " = " + this.value);
    } // end constructor
} // end class

class Octal extends Decimal {
    public int value;

    Octal(int value) {
        super(value);
        System.out.println("Вы ввели "+Integer.toOctalString(value));
        this.value = value;
        System.out.println("число " + ++count + " = " + this.value);
    } // end constructor
} // end class

class Hexademical extends Decimal {
    public int value;

    Hexademical(int value) {
        super(value);
        System.out.println("Вы ввели "+Integer.toHexString(value));
        this.value =value;
        System.out.println("число " + ++count + " = " + this.value);
    } // end constructor
} // end class