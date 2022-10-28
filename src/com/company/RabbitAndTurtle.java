package com.company;

public class RabbitAndTurtle {

    public static void main(String[] args) {
        AnimalThread turtle = (new AnimalThread("Turtle", 10));
        AnimalThread rabbit = (new AnimalThread("Rabbit", 1));
        turtle.start();
        rabbit.start();
    }
}