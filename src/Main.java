public class Main {
    public static void main(String[] args) {
        try {
            UserLogin.loginUser("java_skypro_gofjrndsbsj","D_1hWiKjjP_9","D_1hWiKjjP_9");
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }
        try {
            UserLogin.loginUser("java_skypro_go!","D_1hWiKjjP_9","D_1hWiKjjP_9");
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }
        try {
            UserLogin.loginUser("java_skypro_go","D_1hWiKjjP_9","D_1hWiKjjP_9!");
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }
        try {
            UserLogin.loginUser("java_skypro_go", "D_1hWiKjjP_8", "D_1hWiKjjP_8");
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}