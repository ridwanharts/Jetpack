package com.example.jetpack;

import androidx.annotation.NonNull;

public class User {

    private String name;
    private String nickName;

    public User(String name, String nickName){
        this.name = name;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @NonNull
    @Override
    public String toString() {
        return "My name is " + nickName;
    }
}
