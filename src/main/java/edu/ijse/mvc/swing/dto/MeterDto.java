package edu.ijse.mvc.swing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MeterDto {

    private String meterId;
    private String meterType;
    private Date installion_date;
    private String status_type;
    private String location;
    private String customerID;

}
