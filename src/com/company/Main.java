package com.company;

public class Main {

    public static void main(String[] args) {

        CarService MyService = new CarService();
        MyService.CarService(new Kia());
        MyService.CarService(new Hyundai());
        MyService.CarService(new TruckAdapt(new TruckVolvo()));





    }
}
