package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.MeterDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MeterModel {

    public String addMeter(MeterDto meterDto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO meter VALUES(?,?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, meterDto.getMeterId());
        st.setObject(2, meterDto.getMeterType());
        st.setDate(3, meterDto.getInstallion_date());
        st.setObject(4, meterDto.getStatus_type());
        st.setString(5, meterDto.getLocation());
        st.setString(6,meterDto.getCustomerID());

        return st.executeUpdate() > 0 ? "Meter Details Inserted" : "Meter Details Inserted Failed";
    }

    public String updateMeter(MeterDto meterDto) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE meter SET meter_type = ? , installion_date = ? , stutus_type = ? ,location = ? , customer_id = ? WHERE meter_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setObject(1, meterDto.getMeterType());
        st.setDate(2, meterDto.getInstallion_date());
        st.setObject(3, meterDto.getStatus_type());
        st.setString(4, meterDto.getLocation());
        st.setString(5,meterDto.getCustomerID());
        st.setString(6, meterDto.getMeterId());

        return st.executeUpdate() > 0 ? "Meter Details Updated" : "Meter Details Updated Failed";

    }

    public String deleteMeter(String id) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM meter WHERE meter_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);

        return st.executeUpdate() > 0 ? "Meter Details Deleted" : "Meter Details Deleted Failed";
    }

    public MeterDto selectMeter(String id) throws Exception {

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM meter WHERE meter_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);

        ResultSet rst = st.executeQuery();

        if (rst.next()) {
            return new MeterDto(
                    rst.getString("Meter_id"),
                    rst.getString("meter_type"),
                    rst.getDate("date"),
                    rst.getString("status_type"),
                    rst.getString("location"),
                    rst.getString("customer_id")
            );
        }

        return null;
    }

    public ArrayList <MeterDto> getAllMeter() throws Exception{

        ArrayList <MeterDto> meterDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM meter";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            meterDtos.add(new MeterDto(
                    rst.getString("Meter_id"),
                    rst.getString("meter_type"),
                    rst.getDate("date"),
                    rst.getString("status_type"),
                    rst.getString("location"),
                    rst.getString("customer_id")
            ));
        }

        return meterDtos;

    }

}
