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
public class SaludNivPreartView implements Serializable {

    private Integer idnivelpa;
    private String medidfk;
    private String pacidfk;
    private Integer paperiodo;
    private Timestamp pafechahora;
    private Double pasysmedida;
    private Double padiamedida;
    private Double pafcmedida;
}
