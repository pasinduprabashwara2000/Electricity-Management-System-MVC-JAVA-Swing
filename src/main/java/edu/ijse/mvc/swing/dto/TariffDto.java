package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TariffDto {

    private String id;
    private String name;
    private Date effectiveFrom;
    private Date effectiveTo;
    private double fixedCharge;

}
