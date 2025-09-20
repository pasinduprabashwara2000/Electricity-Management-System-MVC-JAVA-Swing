package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.TariffDto;
import edu.ijse.mvc.swing.model.TariffModel;

import java.util.ArrayList;

public class TariffController {

    TariffModel tariffModel = new TariffModel();

    public String addTariff(TariffDto tariffDto) throws Exception{
       return tariffModel.saveTariff(tariffDto);
    }

    public String updateTariff(TariffDto tariffDto) throws Exception{
        return tariffModel.updateTariff(tariffDto);
    }

    public String deleteTariff(String id) throws Exception{
        return tariffModel.deleteTariff(id);
    }

    public TariffDto searchTariff(String id) throws Exception{
        return tariffModel.searchTariff(id);
    }

    public ArrayList <TariffDto> getAllTariff() throws Exception{
        return tariffModel.getAllTariff();
    }
}
