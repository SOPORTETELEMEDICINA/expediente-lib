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

public class SaludNivPesoView implements Serializable {

    private Integer idnivelpeso;
    private String medidfk;
    private String pacidfk;
    private Integer pesoperiodo;
    private Timestamp pesofechahora;
    private Double pesomedida;
}
