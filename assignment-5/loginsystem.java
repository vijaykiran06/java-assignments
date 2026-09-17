class InvalidUsernameException extends Exception {

    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

class AccountLockedException extends Exception {

    public AccountLockedException(String message) {
        super(message);
    }
}

public class loginsystem {

    static String correctUsername = "admin";
    static String correctPassword = "1234";

    static int failedAttempts = 0;
    static final int MAX_ATTEMPTS = 3;

    public static void login(String username, String password)
            throws InvalidUsernameException,
                   InvalidPasswordException,
                   AccountLockedException {

        if (failedAttempts >= MAX_ATTEMPTS) {
            throw new AccountLockedException(
                "Account is locked due to too many failed attempts."
            );
        }

        if (!username.equals(correctUsername)) {

            failedAttempts++;

            throw new InvalidUsernameException(
                "Invalid username."
            );
        }

        if (!password.equals(correctPassword)) {

            failedAttempts++;

            throw new InvalidPasswordException(
                "Invalid password."
            );
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) {

        String[] usernames = {
            "admin",
            "admin",
            "admin",
            "admin"
        };

        String[] passwords = {
            "1111",
            "2222",
            "3333",
            "1234"
        };

        for (int i = 0; i < usernames.length; i++) {

            try {

                login(usernames[i], passwords[i]);

            } catch (InvalidUsernameException e) {

                System.out.println("Attempt " + (i + 1) +
                                   ": " + e.getMessage());

            } catch (InvalidPasswordException e) {

                System.out.println("Attempt " + (i + 1) +
                                   ": " + e.getMessage());

            } catch (AccountLockedException e) {

                System.out.println("Attempt " + (i + 1) +
                                   ": " + e.getMessage());
            }
        }
    }
}