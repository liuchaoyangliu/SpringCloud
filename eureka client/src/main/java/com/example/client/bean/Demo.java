package com.example.client.bean;

import org.springframework.stereotype.Component;

@Component
public class Demo {
    String name = "lihua";
    String id = "2018";
    int age = 18;

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
        return "Demo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
