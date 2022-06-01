package com.example.CakeFactory.service;

import com.example.CakeFactory.model.Cake;
import com.example.CakeFactory.model.TestProtoType;
import com.example.CakeFactory.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CakeService {

    @Autowired
    CakeRepository cakeRepository;


    @Qualifier("ProtoTestClass")
    TestProtoType TestProtoType1;

    @Autowired
    public void setTestProtoType1(TestProtoType TestProtoType1)
    {
        this.TestProtoType1=TestProtoType1;

    }

    @Qualifier("ProtoTestClass")
    TestProtoType TestProtoType2;

    @Autowired
    public void setTestProtoType2(TestProtoType TestProtoType2)
    {
        this.TestProtoType2=TestProtoType2;

    }


    // READ
    public List<Cake> getCakes() {
        try
        {

            System.out.println("Instance 1 called" + TestProtoType1.getCake().getCakeName());
            System.out.println("Instance 2 called" + TestProtoType2.getCake().getCakeName());

            TestProtoType1.getCake().setCakeName("Staberry");
            TestProtoType2.getCake().setCakeName("Vanilla");
            System.out.println("Instance 1 called" + TestProtoType1.getCake().getCakeName());
            System.out.println("Instance 2 called" + TestProtoType2.getCake().getCakeName());

            return cakeRepository.findAll();



        }
        catch(Exception ex)
        {
            throw ex;

        }
    }

    // READ
    public List<Cake> SaveCake(Cake cake) {
        try
        {
            System.out.println("Instance 1 called" + TestProtoType1.getCake().getCakeName());
            System.out.println("Instance 2 called" + TestProtoType2.getCake().getCakeName());

            cakeRepository.save(cake);
            return cakeRepository.findAll();
        }
        catch(Exception ex)
        {
            throw ex;

        }
    }
}
