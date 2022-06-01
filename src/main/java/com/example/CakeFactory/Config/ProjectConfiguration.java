package com.example.CakeFactory.Config;

import com.example.CakeFactory.model.Cake;
import com.example.CakeFactory.model.TestProtoType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
public class ProjectConfiguration {

    @Bean
    //@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("ProtoTestClass1")
    @Primary
    public TestProtoType GetProtoObject1()
    {
        TestProtoType test =new TestProtoType();
        test.setCake(GetCake());
        return test;

    }

    @Bean
    //@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("ProtoTestClass2")
    public TestProtoType GetProtoObject2()
    {
        TestProtoType test =new TestProtoType();
        test.setCake(GetCake());
        return test;

    }
    @Bean
    //@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cake GetCake()
    {
        return new Cake();
    }

}
