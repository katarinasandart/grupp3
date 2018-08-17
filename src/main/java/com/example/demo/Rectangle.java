package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;

public class Rectangle {
    private int height;
    private int width;

    public boolean isSquare(Rectangle rectangle) {

        if (rectangle.getHeight() == rectangle.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(@RequestParam Rectangle rectangle1, @RequestParam Rectangle rectangle2){

        if (rectangle1.getHeight() == rectangle2.getHeight() && rectangle2.getWidth() == rectangle2.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
