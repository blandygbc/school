package com.blandygbc;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
    private CPF cpf;

    private Email email;

    public void withEmail(Email email) {
        this.email = email;
    }

    private String name;
    private List<Phone> phones = new ArrayList<>();

    public StudentBuilder withCpfNameEmail(String cpf, String name, String email) {
        this.cpf = new CPF(cpf);
        this.email = new Email(email);
        this.name = name;
        return this;
    }

    public StudentBuilder withPhone(String ddd, String number) {
        this.phones.add(new Phone(ddd, number));
        return this;
    }

    public void withCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Student build() {
        Student student = new Student(this.cpf, this.name, this.email);
        student.addPhones(this.phones);
        return student;
    }
}
