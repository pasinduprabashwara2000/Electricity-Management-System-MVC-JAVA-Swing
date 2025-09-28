package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.CalculationDto;
import edu.ijse.mvc.swing.model.CalculationModel;

import java.util.ArrayList;

public class CalculationController {

    private final CalculationModel calculationModel =new CalculationModel();

    public ArrayList <CalculationDto> getAllCalculation() throws Exception{
        return calculationModel.getCalculation();
    }

}
