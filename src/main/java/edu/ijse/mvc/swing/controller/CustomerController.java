package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.CustomerDto;
import edu.ijse.mvc.swing.model.CustomerModel;

import java.util.ArrayList;

public class CustomerController {

    private CustomerModel customerModel = new CustomerModel();

    public String addCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.addCustomer(customerDto);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.updateCustomer(customerDto);
    }

    public String deleteCustomer(String customer_id) throws Exception{
        return customerModel.deleteCustomer(customer_id);
    }

    public CustomerDto searchCustomer(String customer_id) throws Exception{
        return customerModel.searchCustomer(customer_id);
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerModel.getAllCustomer();
    }
}
