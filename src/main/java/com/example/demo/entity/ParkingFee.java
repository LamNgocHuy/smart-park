package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parking_fee")
public class ParkingFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parking_fee_id")
    private int parkingFeeId;
    @Column(name = "parking_fee_amount")
    private int parkingFeeAmount;
    @Column(name = "parking_fee_type")
    private String parkingFeeType;
    @OneToMany(mappedBy = "parkingFee")
    private List<Vehicle> vehicleList;

    public int getParkingFeeId() {
        return parkingFeeId;
    }

    public void setParkingFeeId(int parkingFeeId) {
        this.parkingFeeId = parkingFeeId;
    }

    public int getParkingFeeAmount() {
        return parkingFeeAmount;
    }

    public void setParkingFeeAmount(int parkingFeeAmount) {
        this.parkingFeeAmount = parkingFeeAmount;
    }

    public String getParkingFeeType() {
        return parkingFeeType;
    }

    public void setParkingFeeType(String parkingFeeType) {
        this.parkingFeeType = parkingFeeType;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
