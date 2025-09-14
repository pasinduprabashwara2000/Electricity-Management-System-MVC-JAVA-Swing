package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDto {

    private String id;
    private String invoiceID;
    private double paidAmount;
    private Date paymentDate;
    private Method method;

    public enum Method{
        CASH,BANKTRANSFER
    }

}


