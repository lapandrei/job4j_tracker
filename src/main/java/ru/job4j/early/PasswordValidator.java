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
        for (char value : password.toCharArray()) {
            if (Character.isUpperCase(value)) {
                upperCase = true;
            }
            if (Character.isLowerCase(value)) {
                lowerCase = true;
            }
            if (Character.isDigit(value)) {
                digit = true;
            }
            if (!Character.isDigit(value)
                    && !Character.isAlphabetic(value)) {
                specialSymbol = true;
            }
            if (upperCase && lowerCase && digit && specialSymbol) {
                break;
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
        String[] strings = {"qwerty", "password", "admin", "user", "12345"};
        for (String value : strings) {
            if (string.contains(value)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings:"
                        + " qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
