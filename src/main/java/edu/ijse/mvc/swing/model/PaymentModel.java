package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.PaymentDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PaymentModel {

    public String savePayment(PaymentDto paymentDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO payment VALUES (?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,paymentDto.getId());
        st.setString(2,paymentDto.getInvoiceID());
        st.setDouble(3,paymentDto.getPaidAmount());
        st.setDate(4,paymentDto.getPaymentDate());
        st.setString(5,paymentDto.getMethod());

        return st.executeUpdate() > 0 ? "Payment Added Completed" : "Payment Added Failed";

    }

    public String updatePayment(PaymentDto paymentDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE payment WHERE invoice_id = ?, paid_amount = ?, payment_date = ? method = ? WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,paymentDto.getInvoiceID());
        st.setDouble(2,paymentDto.getPaidAmount());
        st.setDate(3,paymentDto.getPaymentDate());
        st.setString(4,paymentDto.getMethod());
        st.setString(5,paymentDto.getId());

        return st.executeUpdate() > 0 ? "Payment Updated Successfully" : "Payment Updated Failed";

    }

    public String deletePayment(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM payment WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        return st.executeUpdate() > 0 ? "Payment Deleted Successfully" : "Payment Deleted Failed";

    }

    public PaymentDto searchPayment(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM payment WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        if(rst.next()){
            return new PaymentDto(
                    rst.getString("id"),
                    rst.getString("invoice_id"),
                    rst.getDouble("paid_amount"),
                    rst.getDate("payment_date"),
                    rst.getString("method")
            );
        }

        return null;
    }

    public ArrayList <PaymentDto> getAllPayment() throws Exception{

        ArrayList <PaymentDto> paymentDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM payment";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            paymentDtos.add(new PaymentDto(
                    rst.getString("id"),
                    rst.getString("invoice_id"),
                    rst.getDouble("paid_amount"),
                    rst.getDate("payment_date"),
                    rst.getString("method")
            ));
        }

        return paymentDtos;

    }

}
