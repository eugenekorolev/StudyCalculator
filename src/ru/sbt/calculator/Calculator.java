package ru.sbt.calculator;

public abstract class Calculator {
    private int base = 10;
    private int inputValue;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }



    public Calculator(int parValue){
        this.inputValue = parValue;
    }

    public abstract void viewResult();

    public int getInputValue() {
        return inputValue;
    }

    public void setInputValue(int inputValue) {
        this.inputValue = inputValue;
    }
//    private abstract int getChangedValue(int parInputValue){
//        //тут вычисление значения в конкретной системе счисления
//        return parInputValue;
//    }

}
