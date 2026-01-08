package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;

    public Long getId(){
        if(id==null){
            id=0L;
        }
        return id;
    }
    public String getName(){
        if(name==null){
            name="";
        }
        return name;
    }
    public String getAge(){
        if(age==null){
            age="";
        }
        return age;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(String age){
        this.age=age;
    }
}
