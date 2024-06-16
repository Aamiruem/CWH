// // package L52PracticeSet;

// class Circle {
//     public int radius;

//     Circle() {
//         System.out.println("I am a non-parametrized constructor of Circle");
//     }

//     Circle(int r) {
//         System.out.println("I am a parametrized constructor of Circle");
//         this.radius = r;
//     }

//     public double area() {
//         return Math.PI * this.radius * this.radius;
//     }
// }

// class Cylinder extends Circle {
//     public int height;

//     Cylinder() {
//         System.out.println("I am a non-parametrized constructor of Cylinder");
//     }

//     Cylinder(int r, int h) {
//         super(r);
//         System.out.println("I am a parametrized constructor of Cylinder");
//         this.height = h;
//     }

//     public double volume() {
//         return Math.PI * this.radius * this.radius * this.height;
//     }
// }

// public class InheritCircle {
//     public static void main(String[] args) {
//         Circle c = new Circle(12);
//         System.out.println("Area of Circle: " + c.area());

//         Cylinder cy = new Cylinder(3, 5);
//         System.out.println("Volume of Cylinder: " + cy.volume());
//     }
// }




// package com.company;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }
}
