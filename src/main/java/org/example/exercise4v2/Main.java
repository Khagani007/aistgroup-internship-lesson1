package org.example.exercise4v2;

public class Main {
    public static void main(String[] args) {
        Userv2 user1 = new Userv2("khagani001", "Khagani Mammadli", "khagani123", 25, 5000.0);
        Userv2 user2 = new Userv2("samir001", "Samir Suleymanli", "samir123", 25, 5000.0);
        Userv2 user3 = new Userv2("elvin001", "Elvin Aghammadzade", "elvin123", 27, 2000.0);


        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println("User 3: " + user3);


        System.out.println("Total Users: " + Userv2.getCount());
    }
}
