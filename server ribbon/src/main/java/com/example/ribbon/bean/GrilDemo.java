package com.example.ribbon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GrilDemo {

    @Value("${platform.name}")
    String name;
    @Value("${platform.id}")
    String id;
    @Value("${platform.age}")
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GrilDemo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
