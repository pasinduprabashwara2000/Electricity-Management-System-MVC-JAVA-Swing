package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalculationDto {

    private int fromUnit;
    private int toUnit;
    private double ratePerUnit;
    private double fixedPrice;

}
