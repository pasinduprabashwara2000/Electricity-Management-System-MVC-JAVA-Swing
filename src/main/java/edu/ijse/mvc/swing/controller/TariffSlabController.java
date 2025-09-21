package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.TariffSlabDto;
import edu.ijse.mvc.swing.model.TariffSlabModel;

import java.util.ArrayList;

public class TariffSlabController {

    private TariffSlabModel tariffSlabModel = new TariffSlabModel();

    public String addTariffSlab(TariffSlabDto tariffSlabDto) throws Exception{
        return tariffSlabModel.saveTariffSlab(tariffSlabDto);
    }

    public String updateTariffSlab(TariffSlabDto tariffSlabDto) throws Exception{
        return tariffSlabModel.updateTariffSlab(tariffSlabDto);
    }

    public String deleteTariffSlab(String id) throws Exception{
        return tariffSlabModel.deleteTariffSlab(id);
    }

    public TariffSlabDto searchTariffSlab(String id) throws Exception{
        return tariffSlabModel.searchTariffSlab(id);
    }

    public ArrayList <TariffSlabDto> getAllTariffSlab() throws Exception{
        return tariffSlabModel.getAllTariff();
    }

}
