package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {

    private String account;
    private String email;
    private String address;
    private String password;

    @JsonProperty("phone_number")
    //자바에서 변수는 카멜케이스인데 json에서는 스네이크 케이스 쓸때 매핑해주는 역할
    private String phoneNumber;

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
