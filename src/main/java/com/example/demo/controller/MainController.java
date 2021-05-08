package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Vehicle;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ParkingFeeService;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private ParkingFeeService parkingFeeService;
    @RequestMapping(value = "/")
    public String gotoHomePage(){
        return "index";
    }
    @RequestMapping(value = "/viewCustomer")
    public String gotoViewCustomerPage(Model model){
        model.addAttribute("customerList", customerService.getAllCustomer());
        return "viewCustomer";
    }
    @RequestMapping(value = "/viewVehicle")
    public String gotoViewVehiclePage(Model model){
        model.addAttribute("vehicleList", vehicleService.getAllVehicle());
        return "viewVehicle";
    }
    @RequestMapping(value = "/viewParkingFee")
    public String gotoViewParkingFeePage(Model model){
        model.addAttribute("parkingFeeList", parkingFeeService.getAllParkingFee());
        return "viewParkingFee";
    }
    @RequestMapping(value = "/addCustomer")
    public String gotoAddCustomerPage(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("parkingFeeList", parkingFeeService.getAllParkingFee());
        return "addCustomer";
    }
    @RequestMapping(value = "/saveCustomer")
    public String saveCustomer(Customer customer, Model model){
        if (customer.getVehicle() != null) {
            Vehicle vehicle = vehicleService.saveVehicle(customer.getVehicle());
            vehicle.setCustomer(customer);
            customer.setVehicle(vehicle);
        }
        if (customerService.saveCustomer(customer)) {
            System.out.println("Saved customer.");
            model.addAttribute("messenger","New Customer saved.");
        }
        else {
            System.out.println("Didn't save customer.");
            model.addAttribute("messenger", "New Customer didn't save.");
        }
        return "redirect:/viewCustomer";
    }
    @RequestMapping(value = "/editCustomer")
    public String editCustomer(@RequestParam("id")int id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));
        model.addAttribute("parkingFeeList", parkingFeeService.getAllParkingFee());
        return "addCustomer";
    }
    @RequestMapping(value = "/deleteCustomer")
    public String deleteCustomer(@RequestParam("id") int id, Model model){
        if (customerService.deleteCustomerById(id)){
            model.addAttribute("messenger", "Deleted Customer");
        }else {
            model.addAttribute("messenger", "Didn't delete Customer");
        }
        return "redirect:/viewCustomer";
    }
    @RequestMapping(value = "/saveVehicle")
    public String saveVehicle(Vehicle vehicle, Model model){
        if (vehicleService.saveVehicle(vehicle) != null){}
        else {
            System.out.println("Didn't save vehicle.");
        }
        return "redirect:/viewCustomer";
    }
}
