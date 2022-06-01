package com.example.CakeFactory.model;

import org.springframework.stereotype.Component;

@Component
public class TestProtoType {

    private Integer ClassID =3;
    private String Test;
    private Cake cake;

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }



    public Integer getClassID() {
        return ClassID;
    }

    public void setClassID(Integer classID) {
        ClassID = classID;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }
}
