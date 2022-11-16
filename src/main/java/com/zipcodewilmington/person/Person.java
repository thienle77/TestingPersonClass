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

    public Person(String name, int age, String ) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {

    }

    public void setAge(int age) {
    }

    public String getName() {
        return null;
    }

    public Integer getAge() {
        return null;
    }
}
