package com.company;

public class Person {
    public String name;
    public String place;

    public Person(String input_name, String input_place){
        name = input_name;
        place = input_place;
    }
    public void say(){
        System.out.println("私の名前は" + name + "です。"+ place +"出身です。");
    }
}

