package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicle() {return (List<Vehicle>) vehicleRepository.findAll();}

    public Vehicle getVehicle(int id) {return vehicleRepository.findByVehicleId(id);}

    public boolean deleteVehicleById(int id) {
        try{
            vehicleRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        try {
            return vehicleRepository.save(vehicle);
        }catch (Exception e) {
            return null;
        }
    }
}
