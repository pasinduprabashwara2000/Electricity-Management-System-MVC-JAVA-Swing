package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.MeterReading;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MeterReadingModel {

    public String saveReading(MeterReading meterReading) throws Exception{
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO meter_reading VALUES (?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,meterReading.getReadingId());
        st.setString(2,meterReading.getMeterId());
        st.setInt(3,meterReading.getReadingValue());
        st.setDate(4,meterReading.getReadingDate());
        st.setString(5,meterReading.getRecorderdBy());

        return st.executeUpdate() > 0 ? "Meter Reading Inserted Successfully" : "Meter Reading Inserted Failed";

    }

    public String updateReading(MeterReading meterReading) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE meter_reading SET meter_id = ?, reading_value = ?, reading_date = ?, recorded_by = ? WHERE reading_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,meterReading.getMeterId());
        st.setInt(2,meterReading.getReadingValue());
        st.setDate(3,meterReading.getReadingDate());
        st.setString(4,meterReading.getRecorderdBy());
        st.setString(5,meterReading.getReadingId());

        return st.executeUpdate() > 0 ? "Meter Reading Updated Successfully" : "Meter Reading Updated Failed";

    }

    public String deleteReading(String readingID) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM meter_reading WHERE meter_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,readingID);

        return st.executeUpdate() > 0 ? "Meter Reading Delete Successfully" : "Meter Reading Deleted Failed";

    }

}
