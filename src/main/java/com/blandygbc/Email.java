package com.blandygbc;

/*
 * Value Object
 */
public class Email {
    private final String name;
    private final String domain;

    public Email(String email) {
        if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidEmailException("O email informado é inválido!");
        }
        String[] splited = email.split("@");
        this.name = splited[0];
        this.domain = splited[1];
    }

    public String getEmailAdress() {
        return name + "@" + domain;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }
}
