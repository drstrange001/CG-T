package com.company;

import java.util.Scanner;

class Login {
    private final String userId = "Ajay";
    private final String password = "password";

    public String loginUser(String user, String pass) {
        String result = "You have entered wrong credentials ,please enter the right credentials.";
        if (userId.equals(user) && password.equals(pass)) {
            result = "Welcome Ajay";
        }
        return result;
    }

}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String uid, pwd;
        String result = "failed";
        Login obj = new Login();
        for (int i = 0; i < 3; i++) {
            uid = scanner.nextLine();
            pwd = scanner.nextLine();
            result = obj.loginUser(uid, pwd);
            if (result.equals("Welcome Ajay")) {
                System.out.println(result);
                return;
            } else {
                System.out.println(result);
            }
        }
        System.out.println("You have entered wrong credentials 3 times" +
                "\n" +
                "Contact Admin");
    }
}