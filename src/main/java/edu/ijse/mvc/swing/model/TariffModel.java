package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.TariffDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TariffModel {

    public String saveTariff(TariffDto tariffDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO tariff VALUES (?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,tariffDto.getId());
        st.setString(2,tariffDto.getName());
        st.setDate(3,tariffDto.getEffectiveFrom());
        st.setDate(4,tariffDto.getEffectiveTo());
        st.setDouble(5,tariffDto.getFixedCharge());

        return st.executeUpdate() > 0 ? "Tariff Inserted Successfully" : "Tariff Inserted Failed";

    }

    public String updateTariff(TariffDto tariffDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE tariff SET name = ?, elective_from = ?, elective_to = ?, fixed_charge = ? WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,tariffDto.getName());
        st.setDate(2,tariffDto.getEffectiveFrom());
        st.setDate(3,tariffDto.getEffectiveTo());
        st.setDouble(4,tariffDto.getFixedCharge());
        st.setString(5,tariffDto.getId());

        return st.executeUpdate() > 0 ? "Tariff Updated" : "Tariff Updated Failed";

    }

    public String deleteTariff(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM tariff WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        return st.executeUpdate() > 0 ? "Tariff Details Deleted" : "Tariff Details Deleted Failed";

    }

    public TariffDto searchTariff(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM tariff WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        ResultSet rst = st.executeQuery();

        if(rst.next()){
            return new TariffDto(
                    rst.getString("id"),
                    rst.getString("name"),
                    rst.getDate("elective_from"),
                    rst.getDate("elective_to"),
                    rst.getDouble("fixed_charge")
            );
        }

        return null;

    }

    public ArrayList <TariffDto> getAllTariff() throws Exception{

        ArrayList <TariffDto> tariffDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM tariff";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            tariffDtos.add(new TariffDto(
                    rst.getString("id"),
                    rst.getString("name"),
                    rst.getDate("elective_from"),
                    rst.getDate("elective_to"),
                    rst.getDouble("fixed_charge")
            ));
        }

        return tariffDtos;

    }
}
