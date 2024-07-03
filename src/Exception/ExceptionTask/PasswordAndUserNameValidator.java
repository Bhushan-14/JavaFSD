package Exception.ExceptionTask;

public class PasswordAndUserNameValidator {
    public boolean isValidPassword(String password, String confirmPassword) {
        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
            return false;
        }
        if (!Character.isUpperCase(password.charAt(0))) {
            System.out.println("Password must start with an uppercase letter");
            return false;
        }
        if (!password.matches("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[_@]).*$")) {
            System.out.println("Password must contain at least one digit, one letter, and one of '_', '@'");
            return false;
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
            return false;
        }
        return true;
    }
}
