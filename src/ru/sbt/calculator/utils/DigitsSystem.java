package ru.sbt.calculator.utils;

public enum DigitsSystem {
    DECIMAL(0){
        public Object parse(String string) { return Integer.valueOf(string); }
    },
    BINARY(1){
        public Object parse(String string) { return Integer.valueOf(string); }
    },
    HEX(2){
        public Object parse(String string) { return Integer.valueOf(string); }
    },
    OCT(3){
        public Object parse(String string) { return Integer.valueOf(string); }
    };

    int primitive;
    DigitsSystem(int value){
        this.primitive = value;
    }
    public Object parse(String string){
        return string;
    }
}
