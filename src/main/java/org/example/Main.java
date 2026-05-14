package org.example;

public class Main {

    public static void main() {
        printHello();
        printDbUserInfo();
    }

    static void printHello() {
        System.out.println("Hello World from Java!");
    }

    static void printDbUserInfo() {
        String dbUser = System.getenv("DB_USER");

        if (dbUser == null) {
            System.out.println("DB_USER not set");
        } else {
            System.out.println(
                    "DB_USER starts with: " +
                            dbUser.substring(0, Math.min(2, dbUser.length())) +
                            "***"
            );
        }
    }
}