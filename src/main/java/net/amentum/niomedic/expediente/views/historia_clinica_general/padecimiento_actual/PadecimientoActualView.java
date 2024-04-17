package net.amentum.niomedic.expediente.views.historia_clinica_general.padecimiento_actual;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PadecimientoActualView {
    Long idPadecimientoActual;
    Long idHistoriaClinica;
    String motivoConsulta;
    String descripcionPadecimiento;
    Boolean esVistoOtroMedico;
    String medicamentoUsado;
    String notas;
}
