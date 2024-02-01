public class UserLogin {
    public static void loginUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String[] regexes = {"^[a-zA-Z0-9_]+$", "^[a-zA-Z0-9_]+$"};
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть длиннее 20 символов");
        }
        if (!login.matches(regexes[0])) {
            throw new WrongLoginException("Логин может содержать только латинские буквы, цифры и знак подчёркивания");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может быть длиннее 20 символов");
        }
        if (!password.matches(regexes[1])) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и знак подчёркивания");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        System.out.println("Добро пожаловать");
    }
}
