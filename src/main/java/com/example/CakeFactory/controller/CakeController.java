package com.example.CakeFactory.controller;

import com.example.CakeFactory.model.Cake;
import com.example.CakeFactory.service.CakeService;
import com.example.CakeFactory.service.PrototyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Cakes")
public class CakeController {

    @Autowired
    CakeService cakeservice;

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

    @RequestMapping(value="/GetAll", method= RequestMethod.GET)
    public List<Cake> GetCakes() {
        List<Cake> cakes=  cakeservice.getCakes();
        return cakes;
    }

    @RequestMapping(value="/Save", method= RequestMethod.POST)
    public List<Cake> SaveCake(@RequestBody Cake cake) {
        List<Cake> cakes=  cakeservice.SaveCake(cake);
        return cakes;
    }

}
