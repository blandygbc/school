package com.blandygbc;

public class Phone {
    private final String ddd;
    private final String number;

    public Phone(String ddd, String number) {
        if (ddd == null
                || number == null) {
            throw new InvalidPhoneException("DDD e Número são obrigatórios!");
        }
        if (!number.matches("\\d{8,9}")) {
            throw new InvalidPhoneException("Número inválido!");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new InvalidPhoneException("DDD inválido!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

    public String getFullNumber() {
        return "(" + ddd + ") " + number;
    }
}
