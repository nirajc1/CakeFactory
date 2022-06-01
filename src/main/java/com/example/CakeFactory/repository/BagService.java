package com.example.CakeFactory.repository;

import com.example.CakeFactory.service.Bag;

import java.util.ArrayList;
import java.util.List;

public class BagService {

  /*  public String  GetDeepaFullName()
    {
        return "Deepa Patil";

    }
    public int Getdeepaage()
    {
        return 30;
    }
    public Bag Getbag(){
        Bag bobj=new Bag();
        bobj.Bagname="MK";
        bobj.Id=1;
        bobj.Color="black";
        return bobj;
    }
    public Bag GetBlueBag(){
        Bag obj1=new Bag();
        obj1.Color="blue";
        obj1.Id=2;
        obj1.Bagname="MK";
        return obj1;
    }*/
    public List<Bag> GetListofbag(){
        List<Bag> LBobj=new ArrayList<>();
        Bag bobj=new Bag();
        bobj.Bagname="MK";
        bobj.Id=1;
        bobj.Color="black";

        Bag obj1=new Bag();
        obj1.Color="blue";
        obj1.Id=2;
        obj1.Bagname="MK";

        LBobj.add(bobj);
        LBobj.add(obj1);
        return LBobj;
    }
}
