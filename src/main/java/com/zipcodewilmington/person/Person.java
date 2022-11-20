package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String job;
    private String height;
    private int weight;
    private int zipCode;

    public Person() {
       name = "";
       age = Integer.MAX_VALUE;
       gender = "";
       job = "";
       height = "";
       weight = Integer.MAX_VALUE;
       zipCode = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String gender, String job, String height, int weight, int zipCode) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.height = height;
        this.weight = weight;
        this.zipCode = zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

    public void
