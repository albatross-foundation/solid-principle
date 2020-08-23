package com.solid.principle.solution;

public class Square extends Shape {
    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(int width) {
        setWidthAndHeight(width);
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void setHeight(int height) {
        setWidthAndHeight(height);
    }

    private void setWidthAndHeight(int value){
        this.width = value;
        this.height = value;
    }
}
