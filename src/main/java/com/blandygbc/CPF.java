package com.blandygbc;

public class CPF {
    private final String number;

    public CPF(String number) {
        if (number == null ||
                !number.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new InvalidCpfException("CPF invalido!");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

}
