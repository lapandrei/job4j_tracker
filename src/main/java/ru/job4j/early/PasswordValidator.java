package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialSymbol = false;
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                digit = true;
            }
            if (!Character.isDigit(password.charAt(i))
                    && !Character.isAlphabetic(password.charAt(i))) {
                specialSymbol = true;
            }
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one uppercase letter");
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specialSymbol) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one special symbol");
        }
        String string = password.toLowerCase();
        if (string.contains("qwerty") || string.contains("12345") || string.contains("password")
                || string.contains("admin") || string.contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings:"
                    + " qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
