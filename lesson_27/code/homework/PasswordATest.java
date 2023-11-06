package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordATest {
    PasswordA password;

    @BeforeEach
    void setUp() {
        password =new PasswordA("peter@gmail.com","MyP@ssw0rd");
    }

    @Test
    void setEmail() {
        String str = "peter@gmail.com";
        assertEquals(true,password.validateEmail(str));
    }

    @Test
    void setPassword() {
        String str1 = "Myp@ssw1rd";
        assertEquals(true,password.validatePassword(str1));
    }

}