package org.example.exercise4v2;

public class Userv2 {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private double balance;
    private static int count = 0;

    public Userv2() {
        count++;
    }

    public Userv2(String username, String fullName, String password, int age, double balance) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.balance = balance;
        count++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
