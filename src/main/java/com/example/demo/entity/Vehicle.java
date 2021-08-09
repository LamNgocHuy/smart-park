package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicleId;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "vehicle_num")
    private String vehicleNum;
    @Column(name = "status", columnDefinition = "tinyint(1) default false")
    private Boolean status = false;
    @OneToOne
    @JoinColumn(name = "vehicle_own_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "parking_fee_id")
    private ParkingFee parkingFee;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ParkingFee getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(ParkingFee parkingFee) {
        this.parkingFee = parkingFee;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
