package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CuestionarioEmbarazoView implements Serializable {

    private Integer idCuestionario;
    private String medidfk;
    private String pacidfk;
    private boolean dolorDeCabeza;
    private boolean visionBorrosa;
    private boolean mareos;
    private boolean zumbidoEnOidos;
    private boolean dolorAbdominal;
    private boolean sangradoVaginal;
    private boolean sinMovimientoBebe;
    private boolean salidaLiquidoVaginal;
    private boolean hinchazones;
    private boolean vomitoDiarrea;
    private boolean fiebreEscalofrios;
    private boolean peso;
    private boolean dolorAlOrinar;
    private boolean abdomenDuro;
    private Integer totalSi;
    private Integer totalNo;
    private Timestamp horaAplicacion;

}
