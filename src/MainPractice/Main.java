package MainPractice;

import AnonClass.*;
import EnumPractice.*;
import ArrPractice.*;
import StackPractice.*;
import QueuePractice.*;
import MapPractice.*;
import SetPractice.*;
import GenericPractice.*;
import ClassPractice.Abstraction.*;
import ClassPractice.Interface.*;
import ClassPractice.Inheritance.*;
import ClassPractice.Polymorphism.Blue;
import ClassPractice.SuperKeyword.*;
import ClassPractice.Polymorphism.*;
import LambdaPractice.LambdaPractice;

public class Main {

    public static void cutout() {
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        /*
            Anonymous Class
         */
        Anonymous an = new Anonymous();
        an.MyAnonymous();

        cutout();  //cutout the practice

        /*
            Enum
         */
        EnumPractice myenum = new EnumPractice();
        myenum.WhatDay();

        cutout();  //cutout the practice

        /*
            Normal Array
         */
        ArrayPractice ap = new ArrayPractice();
        ap.Array();

        cutout(); //cutout the practice

        /*
            ArrayList
         */
        ArrayListPractice alp = new ArrayListPractice();
        alp.ArrayList();

        cutout(); //cutout the practice

        LinkedListPractice link = new LinkedListPractice();
        link.MyLinked();

        cutout(); //cutout the practice

        /*
            Inheritance
         */
        Student s1 = new Student();

        s1.setFirstName("Phatcharadol");
        s1.setLastName("Thangplub");
        s1.setNickName("Dol");
        s1.setAge(18);
        s1.setFaculty("SIT");
        s1.setMajor("IT");
        s1.setStudentID(1234567890);

        System.out.println(s1.ClubRule(s1.getAge()));
        System.out.println(s1.getFaculty() + "\n" + s1.getMajor());

        cutout(); //cutout the practice

        /*
            Super Keyword
         */
        Hero hero1 = new Hero("Invisible", "Invisible-Man", "Dol", 18);
        Hero hero2 = new Hero("Fly & Healthy", "Fly-Man", "Jack", 21);

        System.out.println(hero1);
        System.out.println(hero2);

        cutout(); //cutout the practice

        /*
            Abstraction & Interface
         */
        Dog d = new Dog();
        System.out.println(d.DogType("Corgi"));

        Car c = new Car();
        c.move();

        cutout(); //cutout the practice

        /*
            Polymorphism
         */
        Red r = new Red();
        Blue b = new Blue();
        Green g = new Green();

        Color[] color = {r, b, g};
        for (Color mycolor : color) {
            System.out.println(mycolor.Greeting());
        }

        cutout(); //cutout the practice

        /*
            Stack
         */
        StackPractice sp = new StackPractice();
        sp.MyStack();

        cutout(); //cutout the practice

        /*
            Queue
         */
        QueuePractice qp = new QueuePractice();
        qp.MyQueue();

        cutout(); //cutout the practice

        /*
            Map
         */
        MapPractice mymap = new MapPractice();
        mymap.MyMap();
        cutout(); //cutout the practice
        mymap.MyTree();
        cutout(); //cutout the practice

        /*
            Set
         */
        SetPractice mys = new SetPractice();
        mys.MySet();

        cutout(); //cutout the practice

        /*
            Generic
         */
        GenericPractice gp = new GenericPractice();
        gp.MyGeneric();

        cutout(); //cutout the practice

        /*
            Lambda
         */
        LambdaPractice lamb = new LambdaPractice();
        lamb.MyLambda();
    }
}
