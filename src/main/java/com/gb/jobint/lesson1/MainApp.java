package com.gb.jobint.lesson1;

import com.gb.jobint.lesson1.person.Person;
import com.gb.jobint.lesson1.polymorph.Circle;
import com.gb.jobint.lesson1.polymorph.Figure;
import com.gb.jobint.lesson1.polymorph.Rectangle;
import com.gb.jobint.lesson1.polymorph.Triangle;

public class MainApp {
    public static void main(String[] args) {

        Person bob = new Person.Builder().setAddress("Moscow").setFirstName("Bob").setLastName("Hoskins").build();
        System.out.println(bob);

        Person alice = new Person.Builder().setAddress("New York").setFirstName("Alice").setLastName("Cooper").setAge(32).setCountry("USA").build();
        System.out.println(alice);

        Figure triangle = new Triangle(10.0f, 5.0f);
        Figure rectangle = new Rectangle(10.0f, 5.0f);
        Figure circle = new Circle(10.0f);

        System.out.printf("Triangle area: %s\nRectangle area: %s\nCircle area: %s", triangle.getArea(), rectangle.getArea(), circle.getArea());
    }
}
