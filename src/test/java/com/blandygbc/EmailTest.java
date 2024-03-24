package com.blandygbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

        @Test
        void shoudNotCreateInvalidEmail() {
                assertThrows(InvalidEmailException.class,
                                () -> new Email(null));
                assertThrows(InvalidEmailException.class,
                                () -> new Email(""));
                assertThrows(InvalidEmailException.class,
                                () -> new Email("invalidEmail"));
        }

        @Test
        void shoudCreateValidEmail() {
                Email validEmail = new Email("valid@email.com");
                assertEquals("valid", validEmail.getName());
                assertEquals("email.com", validEmail.getDomain());
                assertEquals("valid@email.com", validEmail.getEmailAdress());
        }
}
