package com.blandygbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {
    @Test
    void shouldNotCreateCpfWithInvalidNumber() {
        assertThrows(InvalidCpfException.class,
                () -> new CPF(null));
        assertThrows(InvalidCpfException.class,
                () -> new CPF(""));
        assertThrows(InvalidCpfException.class,
                () -> new CPF("1"));
        assertThrows(InvalidCpfException.class,
                () -> new CPF("12345678900"));
        assertThrows(InvalidCpfException.class,
                () -> new CPF("123456789009"));
    }

    @Test
    void shouldCreateCpfWithValidNumber() {
        CPF validCpf = new CPF("123.456.789-00");
        assertEquals("123.456.789-00", validCpf.getNumber());
    }
}
