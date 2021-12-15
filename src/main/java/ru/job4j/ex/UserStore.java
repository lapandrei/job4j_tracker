package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
       User rsl = null;
        for (User tmp : users) {
            if (tmp.getUsername().equals(login)) {
                rsl = tmp;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользователя не найдено.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String str = user.getUsername();
        if (!user.isValid() || str.length() < 4) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
