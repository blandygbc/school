package com.blandygbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PhoneTest {

    @Test
    void shouldNotCreatePhoneWithInvalidDDD() {
        assertThrows(InvalidPhoneException.class,
                () -> new Phone(null, "12345678"));
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("", "12345678"));
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("1", "12345678"));
    }

    @Test
    void shouldNotCreatePhoneWithInvalidNumber() {
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("21", null));
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("21", "1234567890"));
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("21", "1234567"));
        assertThrows(InvalidPhoneException.class,
                () -> new Phone("21", ""));
    }

    @Test
    void shouldCreateValidPhone() {
        Phone validPhone = new Phone("21", "123456789");
        assertEquals("21", validPhone.getDdd());
        assertEquals("123456789", validPhone.getNumber());
        assertEquals("(21) 123456789", validPhone.getFullNumber());
    }
}
