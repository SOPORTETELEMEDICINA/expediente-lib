package net.amentum.niomedic.expediente.views.historia_clinica_general.vacunacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VacunacionView {
    Long idVacunacion;
    Long idHistoriaClinica;
    String nombre;
    String enfermedad;
    String dosis;
    String dosisOrdinal;
    String dosisEdad;
    Date fecha;
    String notas;
}
