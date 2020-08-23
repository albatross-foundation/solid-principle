package com.solid.principle.solution;

public abstract class Shape {
    protected int width;
    protected int height;

    public abstract int getWidth();

    public abstract void setWidth(int width);

    public abstract int getHeight();

    public abstract void setHeight(int height);

    public int getArea() {
        return width * height;
    }
}
