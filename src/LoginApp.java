public class LoginApp {

    private static final String VALID_USERNAME = "sathiya";
    private static final String VALID_PASSWORD = "12345";

    public boolean login(String username, String password) {

        if (username == null || password == null) {
            return false;
        }

        return VALID_USERNAME.equals(username)
                && VALID_PASSWORD.equals(password);
    }
}