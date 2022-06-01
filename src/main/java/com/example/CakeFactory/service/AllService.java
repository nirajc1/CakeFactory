package com.example.CakeFactory.service;

import com.example.CakeFactory.model.Cake;

import java.util.ArrayList;
import java.util.List;

public class AllService {
    public Integer add(int a, int b) {
        int c = a + b;
        return c;
    }

    public Integer sub(int a, int b) {
        return (a - b);
    }

    /*public Bag GetcakebyId(int Id){
    Bag obj=new Bag();
    obj.Bagname="abc";
    obj.Id=1;
    obj.Color="blue";
    return obj;
    }*/
    public List<Bag> GetallBag() {
        List<Bag> Lobj = new ArrayList<>();

        Bag A = new Bag();
        A.Id = 1;
        A.Color = "Black";
        A.Bagname = "super";

        Bag B = new Bag();
        B.Id = 2;
        B.Color = "blue";
        B.Bagname = "class";

        Lobj.add(A);
        Lobj.add(B);

        return Lobj;
    }

    public String NameConcat(String Firstname, String Lastname) {

        String Name = Firstname.concat(Lastname);
        return Name;
    }

}

