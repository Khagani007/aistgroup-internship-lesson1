package org.example.exercise4v1;

public class User {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private double balance;


    public User(String username, String fullName, String password, int age, double balance) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Username: " + username + ", Full Name: " + fullName + ", Age: " + age + ", Balance: " + balance;
    }
}
