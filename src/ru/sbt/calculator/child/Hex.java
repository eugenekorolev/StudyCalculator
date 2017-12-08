package ru.sbt.calculator.child;

import ru.sbt.calculator.Calculator;

public class Hex extends Calculator{

    public final int systemBase = 16;
    public Hex(int parValue) {
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
        String result = null;
        System.out.println("В " + systemBase + "-ой системе счисления разрезультат равен " + result);
    }

}
