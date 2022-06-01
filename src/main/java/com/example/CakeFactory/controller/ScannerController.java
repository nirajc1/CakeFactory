package com.example.CakeFactory.controller;

import com.example.CakeFactory.repository.BagService;
import com.example.CakeFactory.service.Bag;
import com.example.CakeFactory.service.PrototyeService;
import com.example.CakeFactory.service.Scannerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Scanner")
public class ScannerController {

    @Autowired
    PrototyeService protoService1;

    @RequestMapping(value="/TestProto1", method= RequestMethod.GET)
    public String TestProto1() {
        return protoService1.PrintCake1();
    }
    @RequestMapping(value="/TestProto2", method= RequestMethod.GET)
    public String TestProto2() {
        return protoService1.PrintCake2();
    }

}

