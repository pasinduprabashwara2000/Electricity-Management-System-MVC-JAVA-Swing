package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.PaymentDto;
import edu.ijse.mvc.swing.model.PaymentModel;

import java.util.ArrayList;

public class PaymentController {

    private final PaymentModel paymentModel = new PaymentModel();

    public String addPayment(PaymentDto paymentDto) throws Exception{
        return paymentModel.savePayment(paymentDto);
    }

    public String updatePayment(PaymentDto paymentDto) throws Exception{
        return paymentModel.updatePayment(paymentDto);
    }

    public String deletePayment(String id) throws Exception{
        return paymentModel.deletePayment(id);
    }

    public PaymentDto searchPayment(String id) throws Exception{
        return paymentModel.searchPayment(id);
    }

    public ArrayList <PaymentDto> getAllPayment() throws Exception{
        return paymentModel.getAllPayment();
    }

}
