package org.example;

public class Main {
    static void main() {
        System.out.println("Hello World from Java!");

        String dbUser = System.getenv("DB_USER");
        if (dbUser == null) {
            System.out.println("DB_USER not set");
        } else {
            System.out.println("DB_USER starts with: " + dbUser.substring(0, Math.min(2, dbUser.length())) + "***");
        }
    }
}