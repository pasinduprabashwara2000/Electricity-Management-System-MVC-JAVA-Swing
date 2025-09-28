package edu.ijse.mvc.swing.model;

import edu.ijse.mvc.swing.db.DBConnection;
import edu.ijse.mvc.swing.dto.CalculationDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CalculationModel {

    public ArrayList<CalculationDto> getCalculation() throws Exception {

        ArrayList<CalculationDto> calculationDtos = new ArrayList<>();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT tariff_slab.from_unit, tariff_slab.to_unit, tariff_slab.rate_per_unit, tariff.fixed_charge " +
                "FROM tariff " +
                "INNER JOIN tariff_slab " +
                "ON tariff.id = tariff_slab.tariff_id";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rst = st.executeQuery();

        while (rst.next()) {
            calculationDtos.add(new CalculationDto(
                    rst.getInt("from_unit"),
                    rst.getInt("to_unit"),
                    rst.getDouble("rate_per_unit"),
                    rst.getDouble("fixed_charge")
            ));
        }

        return calculationDtos;
    }
}
