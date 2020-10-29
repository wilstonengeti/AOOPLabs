/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
interface Automobile {

    public String getModel();

    public int getNumbers();

    public double getConsumption();

}

abstract class Vehicle {

    private String model;
    private String color;
    private int maxSpeed;

    public abstract void accelerate();

    public abstract void gas();

    public abstract void stop();

    abstract class Bus extends Vehicle {

        //overriding method
        @Override
        public void accelerate() {
            System.out.println("The acceleration is not that good");
        }

        @Override
        public void gas() {
            System.out.println("The gas is not full");
        }

        @Override
        public void stop() {
            System.out.println("You need to stop earlier");
        }
    }

    abstract class Motorcycle extends Vehicle {

        //overriding method
        Motorcycle obj = new Motorcycle() {
            @Override
            public void accelerate() {
                System.out.println("The acceleration is very good");
            }

            @Override
            public void gas() {
                System.out.println("The gas is full");
            }

            @Override
            public void stop() {
                System.out.println("You stop by stepping on the brake");
            }
        };
    }

    class Sedan implements Automobile {

        private String model;
        private int numbers;
        private double consumption;

        @Override
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public int getNumbers() {
            return numbers;
        }
        
        public void setNumbers(){
            this.numbers = numbers;
        }

        @Override
        public double getConsumption() {
            return consumption;
        }
        
        public void setConsumption(){
            this.consumption = consumption;
        }

    }

    class SportsCar implements Automobile {

        private String model;
        private int numbers;
        private double consumption;

        @Override
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public int getNumbers() {
            return numbers;
        }
        
        public void setNumbers(){
            this.numbers = numbers;
        }

        @Override
        public double getConsumption() {
            return consumption;
        }
        
        public void setConsumption(){
            this.consumption = consumption;
        }

    }
    
}

public class Sedan {
 public void accelerate(){
        System.out.println("start moving ");
    }
}
class speed extends Sedan{
    public void topspeed(){
        System.out.println("the speed is 80km/h ");
    }
 
    public void accelerate(){
        System.out.println("the car is approaching top speeedof 80km/h");
    }
}
 
class SedanOverride{
    public static void main(String [] args){
        Sedan Sedan = new speed();
        Sedan.accelerate();
    }
} 

class SedanOverload {
    private static void accelerate(int a){
        System.out.println("Acceleration time is: " + a);
    }

    private static void accelerate(int a, int b){
        System.out.println("The acceleration and Top speed is: " + a + " and " + b);
    }

    public static void main(String[] args) {
        accelerate(2);
        accelerate(2, 80);
    }
}


