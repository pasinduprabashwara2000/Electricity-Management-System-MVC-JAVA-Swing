package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.MeterReading;
import edu.ijse.mvc.swing.model.MeterReadingModel;

public class MeterReadingController {

    MeterReadingModel meterReadingModel = new MeterReadingModel();

    public String saveMeterReading(MeterReading meterReading) throws Exception{
        return meterReadingModel.saveReading(meterReading);
    }

    public String updateMeterReading(MeterReading meterReading) throws Exception{
        return meterReadingModel.updateReading(meterReading);
    }

    public String deleteMeterReading(String meterID) throws Exception{
        return meterReadingModel.deleteReading(meterID);
    }

}
