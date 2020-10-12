package week1.classes;

import java.sql.SQLOutput;

public class Rectangle {
    // --> Create the blueprint + instance variables
    private int width = 1;
    private int height = 1;
    private String color = "Blue";


    // Constructors
    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Methods
    void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (width - 1); j++) {
                System.out.print(color.charAt(0));
            }
            System.out.println(color.charAt(0));
        }
    }

    // Getters, Setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 1) {
            this.width = width;
        } else {
            System.out.println("The Width of the Rectangle must be 1 or greater");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 1) {
            this.height = height;
        } else {
            System.out.println("The Height of the Rectangle must be 1 or greater");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (Character.isUpperCase(color.charAt(0))) {
            if (color.length() >= 2 && color.length() <= 20) {
                this.color = color;
            } else {
                System.out.println("Color must contain between 2 and 20 characters");
            }
        } else {
            System.out.println("Color must be capitalized");
        }
    }



}
