package com.khomkrit.leetcode;

// Design a parking system for a parking lot.
// The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    // The number of slots for each parking space are given as part of the constructor.
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // Checks whether there is a parking space of carType for the car that wants to get into the parking lot.
    // carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
    // A car can only park in a parking space of its carType.
    // If there is no space available, return false, else park the car in that size space and return true.
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    return true;
                }
                break;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    return true;
                }
                break;
            case 3:
                if (this.small > 0) {
                    this.small--;
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
        System.out.println(parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        System.out.println(parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        System.out.println(parkingSystem.addCar(1)); // return false because there is no available slot for a big car. It is already occupied.
    }
}
