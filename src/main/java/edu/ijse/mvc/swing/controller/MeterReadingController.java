package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.MeterReading;
import edu.ijse.mvc.swing.model.MeterReadingModel;
import java.util.ArrayList;

public class MeterReadingController {

    private MeterReadingModel meterReadingModel = new MeterReadingModel();

    public String saveMeterReading(MeterReading meterReading) throws Exception{
        return meterReadingModel.saveReading(meterReading);
    }

    public String updateMeterReading(MeterReading meterReading) throws Exception{
        return meterReadingModel.updateReading(meterReading);
    }

    public String deleteMeterReading(String meterID) throws Exception{
        return meterReadingModel.deleteReading(meterID);
    }

    public MeterReading searchReading(String meterID) throws Exception{
        return meterReadingModel.searchReading(meterID);
    }

    public ArrayList <MeterReading> getAllReading () throws Exception {
        return meterReadingModel.getAllReading();
    }

}
