package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.TariffSlabDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TariffSlabModel {

    public String saveTariffSlab(TariffSlabDto tariffSlabDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO tariff_slab VALUES (?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,tariffSlabDto.getId());
        st.setString(2,tariffSlabDto.getTariffID());
        st.setInt(3,tariffSlabDto.getFromUnit());
        st.setInt(4,tariffSlabDto.getToUnit());
        st.setDouble(5,tariffSlabDto.getRatePerUnit());

        return st.executeUpdate() > 0 ? "Tariff Slab Details Inserted" : "Tariff Slab Details Inserted Failed";

    }

    public String updateTariffSlab(TariffSlabDto tariffSlabDto) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE tariff_slab SET tariff_id = ?, from_unit = ?, to_unit = ?, rate_per_unit = ? WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,tariffSlabDto.getTariffID());
        st.setInt(2,tariffSlabDto.getFromUnit());
        st.setInt(3,tariffSlabDto.getToUnit());
        st.setDouble(4,tariffSlabDto.getRatePerUnit());
        st.setString(5,tariffSlabDto.getId());

        return st.executeUpdate() > 0 ? "Tariff Slab Updated Success" : "Tariff Slab Updated Failed";
    }

    public String deleteTariffSlab(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM tariff_slab WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        return st.executeUpdate() > 0 ? "Tariff Slab Deleted" : "Tariff Slab Deleted Failed";

    }

    public TariffSlabDto searchTariffSlab(String id) throws Exception{

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM tariff_slab WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);

        ResultSet rst = st.executeQuery();

        if(rst.next()){
            return new TariffSlabDto(
                    rst.getString("id"),
                    rst.getString("tariff_id"),
                    rst.getInt("from_unit"),
                    rst.getInt("to_unit"),
                    rst.getDouble("rate_per_unit")
            );
        }

        return null;

    }

    public ArrayList <TariffSlabDto> getAllTariff() throws Exception{

        ArrayList <TariffSlabDto> slabDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM tariff_slab";
        PreparedStatement st = conn.prepareStatement(sql);

        ResultSet rst = st.executeQuery();

        while (rst.next()){
            slabDtos.add(new TariffSlabDto(
                    rst.getString("id"),
                    rst.getString("tariff_id"),
                    rst.getInt("from_unit"),
                    rst.getInt("to_unit"),
                    rst.getDouble("rate_per_unit")
            ));
        }

        return slabDtos;

    }

}
