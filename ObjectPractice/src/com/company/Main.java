package com.company;
public class Main {
    public static void main(String[] args) {
        //課題４、５になります

        Person person = new Person(
                "name",
                "place"
        );
        Person person1 = new Person(
                "森田",
                "奈良県"
        );
        Person person2 = new Person(
                "木村",
                "埼玉県"
        );
        Person person3 = new Person(
                "高山",
                "東京都"
        );
        Person person4 = new Person(
                "茂木",
                "沖縄県"
        );

        person.say();
        person1.say();
        person2.say();
        person3.say();
        person4.say();
    }
}
