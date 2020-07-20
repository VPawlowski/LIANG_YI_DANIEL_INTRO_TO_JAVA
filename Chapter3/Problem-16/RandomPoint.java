package com.liang.y.daniel.chapter.three;

/* Write a program that displays a random coordinate in a rectangle. The rectangle is centred at (0, 0) with width 50
and height 150. */

public class RandomPoint {
    public static void main(String[] args) {
    final int MAXIMUM_WIDTH = 25;
    // Normally (max - min) - however, coordinates can be negative; so minus a minus is a positive
    int randomX = (int) (Math.random() * (MAXIMUM_WIDTH + MAXIMUM_WIDTH)) - MAXIMUM_WIDTH;
    final int MAXIMUM_HEIGHT = 150;
    int randomY = (int) (Math.random() * (MAXIMUM_HEIGHT + MAXIMUM_HEIGHT)) - MAXIMUM_HEIGHT;
    System.out.println("Rectangle Coordinates: (" + randomX + ", " + randomY + ")");
    }
}
