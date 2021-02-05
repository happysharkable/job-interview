package com.gb.jobint.lesson1.polymorph;

public class Rectangle extends Figure {
    private float height;
    private float base;

    public Rectangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return height * base;
    }
}
