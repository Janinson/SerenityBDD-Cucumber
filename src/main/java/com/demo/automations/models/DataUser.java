package com.demo.automations.models;

public class DataUser {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    private String username;
    private String password;

    public DataUser(String firstName, String lastName, String phoneNumber,
                String emailAddress, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
