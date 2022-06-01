package com.example.CakeFactory.service;

import com.example.CakeFactory.model.TestProtoType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.INTERFACES)
public class PrototyeService {

    @Qualifier("ProtoTestClass1")
    @Autowired
    TestProtoType testProtoType1;

    @Qualifier("ProtoTestClass2")
    @Autowired
    TestProtoType testProtoType2;



    public String PrintCake1()
    {
        System.out.println(testProtoType1.hashCode());
        System.out.println(testProtoType2.hashCode());
        System.out.println(testProtoType1.getCake().getCakeName());
        System.out.println(testProtoType2.getCake().getCakeName());
        return testProtoType2.getCake().getCakeName();
    }

    public String PrintCake2()
    {
        System.out.println(testProtoType2.getCake().getCakeName());
        return testProtoType2.getCake().getCakeName();
    }


}
