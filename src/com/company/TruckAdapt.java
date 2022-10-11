package com.company;

public class TruckAdapt implements Car{
    Truck truck;

    public TruckAdapt(Truck truck) {
        this.truck = truck;
    }


    @Override
    public void Service() {
        truck.ServiceTruck();
    }
}
