package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerModel {

    public String addCustomer(CustomerDto customerDto) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, customerDto.getCustomerId());
        st.setString(2, customerDto.getCustomerName());
        st.setString(3, customerDto.getCustomerAddress());
        st.setInt(4, customerDto.getCustomerContact());
        st.setString(5, customerDto.getCustomerEmail());

        return st.executeUpdate() > 0 ? "Customer Inserted Successfully" : "Customer Inserted Failed";
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET customer_name = ? , customer_address = ? , customer_contact = ? , customer_email = ? WHERE customer_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, customerDto.getCustomerName());
        st.setString(2, customerDto.getCustomerAddress());
        st.setInt(3, customerDto.getCustomerContact());
        st.setString(4, customerDto.getCustomerEmail());
        st.setString(5, customerDto.getCustomerId());

        return st.executeUpdate() > 0 ? "Customer Updated Succefully" : "Customer Update Failed";

    }

    public String deleteCustomer(String customer_id) throws Exception {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM customer WHERE customer_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, customer_id);

        return st.executeUpdate() > 0 ? "Customer Deleted Successfully" : "Customer Deleted Failed";
    }

    public CustomerDto searchCustomer(String customer_id) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE customer_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, customer_id);

        ResultSet rst = st.executeQuery();

        if (rst.next()) {
            return new CustomerDto(
                    rst.getString("customer_id"),
                    rst.getString("customer_name"),
                    rst.getString("customer_address"),
                    rst.getInt("customer_contact"),
                    rst.getString("customer_email")
            );
        }

        return null;
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {

        ArrayList<CustomerDto> customerDto = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();
        while (rst.next()){
            customerDto.add(new CustomerDto(
                    rst.getString("customer_id"),
                    rst.getString("customer_name"),
                    rst.getString("customer_address"),
                    rst.getInt("customer_contact"),
                    rst.getString("customer_email")
            ));
        }

        return customerDto;
    }
}




