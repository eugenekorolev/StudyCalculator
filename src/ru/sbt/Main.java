package ru.sbt;

import ru.sbt.calculator.Calculator;
import ru.sbt.calculator.child.Binary;
import ru.sbt.calculator.child.Hex;
import ru.sbt.calculator.child.Oct;
import ru.sbt.calculator.utils.DigitsSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ru.sbt.calculator.utils.DigitsSystem.HEX;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.print("Enter system : ");
                String system = br.readLine();

                System.out.print("Enter number : ");
                String value = br.readLine();
                switch (DigitsSystem.valueOf(system)){
                    case HEX:
                        calculator = new Hex(Integer.valueOf(value));
                        calculator.viewResult();
                        break;
                    case OCT:
                        calculator = new Oct(Integer.valueOf(value));
                        calculator.viewResult();
                        break;
                    case BINARY:
                        calculator = new Binary(Integer.valueOf(value));
                        calculator.viewResult();
                        break;
                    default:
                        calculator.getInputValue();
                        break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
