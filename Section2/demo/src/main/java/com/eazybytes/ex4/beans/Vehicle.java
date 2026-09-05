package com.eazybytes.ex4.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class Vehicle  {

    public Vehicle(){
        System.out.println("Vehicle been created");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    //   @PostConstruct
//    public  void initialize(){
//      this.name="Audi";
//    }

//    @PreDestroy
//    public void destroy(){
//        System.out.println("Destroying Vehicle Bean");
//    }
}
