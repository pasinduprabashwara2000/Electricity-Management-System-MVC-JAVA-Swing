package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InvoiceDto {

    private String id;
    private String invoiceNumber;
    private String customerID;
    private String meterID;
    private Date periodStart;
    private Date periodEnd;
    private int consumptionUnits;
    private double total_amount;
    private Status status;

    public enum Status{
        PAID,UNPAID
    }

}
