package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TariffSlabDto {

    private String id;
    private String tariffID;
    private int fromUnit;
    private int toUnit;
    private double ratePerUnit;

}
