package com.example.CakeFactory.controller;

import com.example.CakeFactory.repository.BagService;
import com.example.CakeFactory.service.CakeService;

public class BagController {

    public String GetName()
    {
        BagService bagSvc =new BagService();

        return ""; //bagSvc.GetDeepaFullName();


    }


    public static void main(String[] args) {

        BagController bagController =new BagController();
        String name =bagController.GetName();
        System.out.println(name);

    }

}
