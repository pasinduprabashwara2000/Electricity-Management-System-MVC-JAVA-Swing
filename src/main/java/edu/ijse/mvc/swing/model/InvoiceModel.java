package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.InvoiceDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InvoiceModel {

    public String saveInvoice(InvoiceDto invoiceDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO invoice VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,invoiceDto.getId());
        st.setString(2,invoiceDto.getCustomerID());
        st.setString(3,invoiceDto.getMeterID());
        st.setDate(4,invoiceDto.getPeriodStart());
        st.setDate(5,invoiceDto.getPeriodEnd());
        st.setInt(6,invoiceDto.getConsumptionUnits());
        st.setDouble(7,invoiceDto.getTotal_amount());
        st.setString(8,invoiceDto.getStatus());

        return st.executeUpdate() > 0 ? "Invoice Saved Successfully" : "Invoice Saved Failed";

    }

    public String updateInvoice(InvoiceDto invoiceDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE invoice SET customer_id = ?, meter_id = ?, period_start =?, period_end = ?,consumption_units = ?, total_amount = ?, status = ? WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,invoiceDto.getCustomerID());
        st.setString(2,invoiceDto.getMeterID());
        st.setDate(3,invoiceDto.getPeriodStart());
        st.setDate(4,invoiceDto.getPeriodEnd());
        st.setInt(5,invoiceDto.getConsumptionUnits());
        st.setDouble(6,invoiceDto.getTotal_amount());
        st.setString(7,invoiceDto.getStatus());
        st.setString(8,invoiceDto.getId());


        return st.executeUpdate() > 0 ? "Invoice Updated Successfully" : "Invoice Updated Failed";
    }

    public String deleteInvoice(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE from invoice WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        return st.executeUpdate() > 0 ? "Invoice Deleted" : "Invoice Deleted Failed";

    }

    public InvoiceDto searchInvoice(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM invoice WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        if(rst.next()){
            return new InvoiceDto(
                    rst.getString("id"),
                    rst.getString("customer_id"),
                    rst.getString("meter_id"),
                    rst.getDate("period_start"),
                    rst.getDate("period_end"),
                    rst.getInt("consumption_unit"),
                    rst.getDouble("total_amount"),
                    rst.getString("status")
            );
        }

        return null;

    }

    public ArrayList <InvoiceDto> getAllInvoice() throws Exception{

        ArrayList <InvoiceDto> invoiceDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM invoice";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            invoiceDtos.add(new InvoiceDto(
                    rst.getString("id"),
                    rst.getString("customer_id"),
                    rst.getString("meter_id"),
                    rst.getDate("period_start"),
                    rst.getDate("period_end"),
                    rst.getInt("consumption_unit"),
                    rst.getDouble("total_amount"),
                    rst.getString("status")
            ));

        }

        return invoiceDtos;

    }

}
