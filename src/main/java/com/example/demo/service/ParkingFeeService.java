package com.example.demo.service;

import com.example.demo.entity.ParkingFee;
import com.example.demo.repository.ParkingFeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingFeeService {
    @Autowired
    private ParkingFeeRepository parkingFeeRepository;

    public List<ParkingFee> getAllParkingFee() {return (List<ParkingFee>) parkingFeeRepository.findAll();}

    public ParkingFee getParkingFeeById(int id) {return parkingFeeRepository.findByParkingFeeId(id);}

    public boolean deleteParkingFeeById(int id){
        try{
            parkingFeeRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    public boolean saveParkingFee(ParkingFee parkingFee){
        try {
            parkingFeeRepository.save(parkingFee);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
