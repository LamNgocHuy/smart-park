package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private VehicleService vehicleService;

    public List<Customer> getAllCustomer() {return (List<Customer>) customerRepository.findAll();}

    public Customer getCustomerById(int id) {
        return customerRepository.findByCusId(id);
    }

    public boolean deleteCustomerById(int id) {
        try{
            if (customerRepository.findByCusId(id).getVehicle()!=null)vehicleService.deleteVehicleById(customerRepository.findByCusId(id).getVehicle().getVehicleId());
            customerRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean saveCustomer(Customer customer){
        try {
            customerRepository.save(customer);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
