package com.example.CakeFactory.controller;

import com.example.CakeFactory.service.AllService;
import com.example.CakeFactory.service.Bag;

import java.util.List;

public class AllController {


    public static void main(String[] args) {
        AllService obj = new AllService();
        /*List<Bag> c = obj.GetallBag();

        for (Bag a : c) {
            System.out.println(a.Id);
            System.out.println(a.Bagname);
            System.out.println(a.Color);

        }*/
        String Fullname=obj.NameConcat("john","dear");
        System.out.println(Fullname);
    }
}

