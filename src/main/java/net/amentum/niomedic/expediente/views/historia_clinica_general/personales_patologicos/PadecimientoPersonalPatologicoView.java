package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PadecimientoPersonalPatologicoView {
    Long idPadecimiento;
    Long idHistoriaClinica;
    Boolean tieneEnfermedad;
    String enfermedad;
    String tiempoEvolucion;
    String tratamiento;
    String notas;
}
