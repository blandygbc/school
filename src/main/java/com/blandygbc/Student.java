package com.blandygbc;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private CPF cpf;
    private String name;
    private Email email;

    private List<Phone> phones = new ArrayList<>();

    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void addPhones(List<Phone> phones) {
        this.phones.addAll(phones);
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
