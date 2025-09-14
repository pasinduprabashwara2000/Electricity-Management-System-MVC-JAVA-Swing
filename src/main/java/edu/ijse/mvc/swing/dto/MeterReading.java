package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MeterReading {

    private String readingId;
    private String meterId;
    private int readingValue;
    private Date readingDate;
    private String recorderdBy;

}
