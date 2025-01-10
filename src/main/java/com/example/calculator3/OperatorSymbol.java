package com.example.calculator3;

public enum OperatorSymbol {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private final String symbol;

    OperatorSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorSymbol fromSymbol(String symbol) {
        for (OperatorSymbol operator : values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Invalid operator symbol: " + symbol);
    }
}
