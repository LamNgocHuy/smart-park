package com.example.demo.repository;

import com.example.demo.entity.ParkingFee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFeeRepository extends CrudRepository<ParkingFee, Integer> {
    ParkingFee findByParkingFeeId(int id);
}
