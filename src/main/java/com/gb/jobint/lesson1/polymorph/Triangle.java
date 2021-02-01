package com.gb.jobint.lesson1.polymorph;

public class Triangle extends Figure {
    private float height;
    private float base;

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return 0.5f * height * base;
    }
}
