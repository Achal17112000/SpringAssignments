package bean;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String company;
    String model;
    List<Vehicle> vehicleList = new ArrayList<>();

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void show() {
        System.out.println("*******Car Details*******");
        System.out.println("Company:" + getCompany() );
        System.out.println("Model:" + getModel());
        for(Vehicle item : vehicleList) {
            System.out.println("Vehicle Number:" + item.getVehicle_number());
            System.out.println("Color:" + item.getColor());
            System.out.println("Owner Name:" + item.getOwner_name());
        }
    }
}
