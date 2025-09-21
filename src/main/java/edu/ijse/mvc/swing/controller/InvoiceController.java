package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.InvoiceDto;
import edu.ijse.mvc.swing.model.InvoiceModel;

import java.util.ArrayList;

public class InvoiceController {

    private final InvoiceModel invoiceModel = new InvoiceModel();

    public String addInvoice(InvoiceDto invoiceDto) throws Exception{
        return invoiceModel.saveInvoice(invoiceDto);
    }

    public String updateInvoice(InvoiceDto invoiceDto) throws Exception{
        return invoiceModel.updateInvoice(invoiceDto);
    }

    public String deleteInvoice(String id) throws Exception{
        return invoiceModel.deleteInvoice(id);
    }

    public InvoiceDto searchInvoice(String id) throws Exception{
        return invoiceModel.searchInvoice(id);
    }

    public ArrayList<InvoiceDto> getAllInvoice() throws Exception{
        return invoiceModel.getAllInvoice();
    }

}
