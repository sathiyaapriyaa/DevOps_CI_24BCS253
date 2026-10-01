import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LoginAppTest {

    LoginApp loginApp = new LoginApp();

    @Test
    void testValidLogin() {
        assertTrue(loginApp.login("sathiya", "12345"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(loginApp.login("sathiya", "wrongpassword"));
    }

    @Test
    void testInvalidUsername() {
        assertFalse(loginApp.login("wronguser", "12345"));
    }

    @Test
    void testNullInput() {
        assertFalse(loginApp.login(null, null));
    }
}