package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class SaludNivCovidView implements Serializable {

    private Integer idnivelcovid;
    private String medidfk;
    private String pacidfk;
    private Integer covidperiodo;
    private Timestamp covidfechahora;
    private Double covidtempmedida;
    private Double covidspomedida;
    private Double covidpulsomedida;

}
