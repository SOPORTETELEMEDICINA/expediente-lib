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

public class SaludNivGlucView implements Serializable {

    private Integer idnivelglucosa;
    private String medidfk;
    private String pacidfk;
    private Integer gluperiodo;
    private Timestamp glufechahora;
    private Double glumedida;

}
