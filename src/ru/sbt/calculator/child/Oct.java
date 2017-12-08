package ru.sbt.calculator.child;

import ru.sbt.calculator.Calculator;

public class Oct extends Calculator{
    public final int systemBase = 8;
    public Oct(int parValue) {
        super(parValue);
        super.setBase(systemBase);
    }

    public int getBase() {
        return super.getBase();
    }

    public void setBase(int base) {
        super.setBase(base);
    }
    public void viewResult(){
        String result = "";
        System.out.println("В " + systemBase + "-ой системе счисления разрезультат равен" + result);
    }
}
